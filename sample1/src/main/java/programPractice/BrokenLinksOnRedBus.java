package programPractice;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksOnRedBus 
{
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		int count = all_links.size();
		System.out.println(count);
		List<WebElement> links= new ArrayList<WebElement>();

		for(int i=0;i<count;i++)
		{
			String avl_links = all_links.get(i).getAttribute("href");

			if(avl_links!=null &&(!avl_links.contains("javascript")))
			{
				links.add(all_links.get(i));
			}
			}
		
		int count1=links.size();
		System.out.println(count1);
		for(int j=0;j<count1;j++)
		{
			
				//HttpURLConnection connection=  (HttpURLConnection) new URL(links.get(j).getAttribute("href")).openConnection();
			      HttpURLConnection connection;
				try {
					connection = (HttpURLConnection) new URL(links.get(j).getAttribute("href")).openConnection();
					connection.connect();
					String response=connection.getResponseMessage();
					connection.disconnect();
					System.out.println(links.get(j).getAttribute("href")+"-------->"+response);
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				
		}
		Thread.sleep(10);
		driver.quit();

}
}
