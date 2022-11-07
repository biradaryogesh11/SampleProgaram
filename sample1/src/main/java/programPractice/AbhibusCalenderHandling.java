package programPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbhibusCalenderHandling 
{
	public static void main(String arsg[]) throws InterruptedException
	{
		String month="December";
		String year="2022";
		String date="30";
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	
	while(true)
	{	
		 String monthyear = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
		String [] my=monthyear.split(" ");
//		String m=my[0];
//		String y=my[1];
		
	if(my[0].equals(month)&&my[1].equals(year))
	{
		
	   break;
	}
	else
	{
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}
	}
	 List<WebElement> d = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
	 
	 for(WebElement day:d)
	 {
		  String select_day = day.getText();
		  if(select_day.equals(date))
		  {
			  day.click();
		  }
	 }
	 

	

}
}
