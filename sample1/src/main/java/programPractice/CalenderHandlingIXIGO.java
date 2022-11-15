package programPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandlingIXIGO 
{
	  static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[3]")).click();
		
	    String month="June";
	    String year="2023";
	    String day="14";
	    while(true)
	    {
	    	String monthyear = driver.findElement(By.xpath("(//div[@class='rd-month-label'])[1]")).getText();
		    String[] my = monthyear.split(" ");
	    if(my[0].equals(month)&& my[1].equals(year))
	    {
	    	 break;
	    }
	    else
	    {
	    	driver.findElement(By.xpath("//button[@class='ixi-icon-arrow rd-next']")).click();
	    }
	    }
	    
	    
	    List<WebElement> days = driver.findElements(By.xpath("(//tbody[@class='rd-days-body'])[1]/tr/td"));
	    System.out.println(days.size());
	    
	    for(int i=0;i<days.size();i++)
	    {
	    	 String dd = days.get(i).getText();
	    	 System.out.println(dd);
	    	 if(dd.equals(day))
	    	 {
	    		 days.get(i).click();
	    	 }
	    }
	    
	    
	    
	    Thread.sleep(10000);
	    driver.quit();

	}
	

}
