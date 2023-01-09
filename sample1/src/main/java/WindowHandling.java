import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static WebDriver driver;
	public static void main(String[] args) {
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
		String parent_id=driver.getWindowHandle();
		Set<String> child_id=driver.getWindowHandles();
		
		ArrayList<String> list= new ArrayList<String>(child_id);
		System.out.println(list);
		
		
		if(getRightWindow("Facebook",list))
		{
			System.out.println(driver.getTitle()+" : "+driver.getCurrentUrl());
		}
		
		if(getRightWindow("LinkedIn",list))
		{
			System.out.println(driver.getTitle()+" : "+driver.getCurrentUrl());
		}

	}

	public static boolean getRightWindow(String windowTitle,List<String> list)
	{
		for(String s:list)
		{
			      String title = driver.switchTo().window(s).getTitle();
			      if(title.contains(windowTitle));
			      {
			    	  System.out.println("found correct window");
			    	  return true;
			      }
		}
		return false;
	}

}
