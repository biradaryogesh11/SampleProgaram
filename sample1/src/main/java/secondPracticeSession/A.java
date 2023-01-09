package secondPracticeSession;

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

public class A {

	public static void main(String args[]) throws MalformedURLException, IOException
   {
	   WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
	 List<WebElement>	all_link= driver.findElements(By.tagName("a"));
	 int count=all_link.size();
	 System.out.println(count);
	 
	 ArrayList<WebElement> link= new ArrayList<WebElement>();
	 
	 for(int i=0;i<count;i++)
	 {
		  String ele = all_link.get(i).getAttribute("href");
		  if(ele!=null&&(!ele.contains("javascript")))
		  {
			  link.add(all_link.get(i));
		  }
	 }
	int count1=link.size();
	System.out.println(count1);
   

	for(int i=0;i<count1;i++ ) {
	
	HttpURLConnection connection=(HttpURLConnection) new URL(link.get(i).getAttribute("href")).openConnection();
	connection.connect();
	String message = connection.getResponseMessage();
	connection.disconnect();
	
	
	System.out.println(link.get(i).getAttribute("href")+"=======>"+message);
	}
	
   }
	
}
