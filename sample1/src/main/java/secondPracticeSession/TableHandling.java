package secondPracticeSession;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling {
	public static void main(String args[]) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Point loc = driver.findElement(By.xpath("(//input[@type='submit'])[2]")).getLocation();
		System.out.println(loc);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(521,1900)");
		
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='customers']//th"));
		  for(WebElement title: header)
		  {
			  String header_title=title.getText();
			  System.out.print(header_title+"  |  ");
		  }
		  System.out.println();
		  for(int i=2;i<8;i++)
		  {
			  for(int j=1;j<6;j++)
			  {
				  String table_data = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
				  System.out.print(table_data+"  |  ");
			  }
			  System.out.println();
		  }
}
}
