import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingFacebook 
{
	static WebDriver driver;
	
	public  void fillData(String Date,String month,String year) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		   WebElement select_day = driver.findElement(By.xpath("//select[@id='day']"));
			Select s= new Select( select_day);
			s.selectByValue(Date);
			Thread.sleep(4000);
			
			
			WebElement select_month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s2= new Select( select_month);
			s2.selectByVisibleText(month);
			Thread.sleep(4000);
			WebElement select_year = driver.findElement(By.xpath("//select[@id='year']"));
			Select s1= new Select( select_year);
			s1.selectByValue(year);
			Thread.sleep(4000);
			driver.quit();
	}
	//String Date,String month,String year
	
	public static  void aday(String Date) 
	{
		
		
	}
	public void aMonth( String month ) 
	{
		
	}
	public void aYears( String year) 
	{
		
	}
		
	
}
