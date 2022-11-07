import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink 
{

	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	//	driver.get("https://www.amazon.in/");
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12"+Keys.ENTER);
		
	    List<WebElement> list = driver.findElements(By.tagName("a"));
	    System.out.println(list.size());    
	    
	    List<WebElement> arraylist= new ArrayList<WebElement>();
	    
	    
	    for( int i=0;i<list.size();i++)
	    {
	    	   String link = list.get(i).getAttribute("href");
	    	   if(link!=null&&(!link.contains("javascript")))
	    	   {
	    		   arraylist.add(list.get(i));
	    	   }
	    	
	    }
	    System.out.println(arraylist.size());
	   
	    for(int j=0;j<arraylist.size();j++)
	    {
	    	HttpURLConnection connection;
			try {
				connection = (HttpURLConnection) new URL(arraylist.get(j).getAttribute("href")).openConnection();
				connection.connect();
		    	String response = connection.getResponseMessage();
		    	connection.disconnect();
		    	System.out.println(arraylist.get(j).getAttribute("href")+"---->"+response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
		
		 Thread.sleep(10000);
		driver.quit();
	}
}
