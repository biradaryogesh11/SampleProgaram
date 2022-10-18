import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandling1 
{
	static WebDriver driver;
	public static void main(String arsg[])
	{
		String m="November";
		String y="2022";
		String date="30";
		
			WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		while(true)
		{
			String my = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			String[] monthYear = my.split(" ");
			if(monthYear[0].equalsIgnoreCase(m)&&monthYear[1].equalsIgnoreCase(y))
			{
			      break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
			List<WebElement> day = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
			int count = day.size();
			for(int i=1;i<=count;i++)
			{
				String text = day.get(i).getText();
				if(text.contains(date))
				{
					day.get(i).click();
				   break;
				}
				
			}
		
	}

}
