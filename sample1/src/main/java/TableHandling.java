import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling 
{
	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Point loc = driver.findElement(By.xpath("(//input[@type='submit'])[2]")).getLocation();
		System.out.println(loc);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(521,1900)");
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']//th"));
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='customers']//td"));
		  int count = data.size();
		
		for(WebElement head:header)
		{
			String headerText = head.getText();
			System.out.print(headerText+"  |  ");
		}
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
//		for(WebElement body:data)
//		{
//			 
//			
//		}
		
		
//		for(int i=2;i<=6;i++)
//		{
//			for(int j=2;j<=5;j++)
//			{
//				String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[i]/td[j]")).getText();
//			    System.out.print(text+"  |  ");
//			}
//		}
		
		
		Thread.sleep(10000);
		driver.close();
	}

}
