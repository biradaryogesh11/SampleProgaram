import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling1 
{
	static WebDriver driver;	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");

		List<WebElement> alloption = driver.findElements(By.xpath("//li[@class='sbct']//span/b"));

		int count = alloption.size();

		System.out.println(count);
		for(WebElement option:alloption)
		{
			Thread.sleep(4000);
			if(option.getText().contains("webdriver"))
			{

				option.click();
				break;
			}
		}
		Thread.sleep(10000);
		driver.close();
	}
}
