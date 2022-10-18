import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon 
{
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("macbook pro 13 inch cover");
		List<WebElement> all_option = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		
		for(WebElement option: all_option)
		{
			String text = option.getText();
			System.out.println(text);
			
			if(text.equals("macbook pro 13 inch cover"));
			{
				option.click();
			}
			
			
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.quit();
		
		
	}

}
