import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calenderHandling 
{ static WebDriver driver;
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//label[normalize-space()='Date']")).click();
		
//		String month = monthyear[0];
//		System.out.println(month);
//		String year = monthyear[1];
//		System.out.println(year);
		String m= "Nov";
		String y= "2023";
		String date="30";
		while(true)
		{
			String monthtitle = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			String[] monthyear = monthtitle.split(" ");
		    if(monthyear[0].equalsIgnoreCase(m)&&monthyear[1].equalsIgnoreCase(y))
		    {
		    	break;
		    }
		    else
		    {
		    	driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
		    }
		}
	      List<WebElement> d = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
		 
	    		   int count = d.size();
	    		   for(int i=1;i<count;i++)
	    		   {
	    			   String day = d.get(i).getText();
	    			   if(day.equals(date))
	    			   {
	    				   d.get(i).click();
	    				   
	    		       }
	    		   }
	}

}
