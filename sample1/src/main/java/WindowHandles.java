import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles 
{
	static WebDriver driver;
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();
		String parentid = driver.getWindowHandle();
		Set<String> childId = driver.getWindowHandles();
		List<String> list= new ArrayList<String>(childId);
		if(getRightWindow("Facebook",list))
		{
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
		}
		
		if(getRightWindow("LinkedIn",list))
		{
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
			driver.close();
		}
		closeTheTab(list,parentid);
		
		
	}
     public static void closeTheTab(List<String> list, String parentid)
     {
    	 for(String id: list)
    	 {
    		 if(!(id.equals(parentid)))
    		 {
    			 driver.switchTo().window(id).close();
    		 }
    	 }
    	 
     }
	
	public static boolean getRightWindow(String WindowTitle,List<String> list)
	{    for(String s: list)
		{
			String title = driver.switchTo().window(s).getTitle();
			if(title.contains(WindowTitle))
			{
				System.out.println("found right window");
				return true;
			}
			
		}
	return false;
	    
		
	}
}
