package testNG_Annoatation;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class UtilClass 
{
   public static void ss(WebDriver driver,String filename) throws IOException
   {
	   TakesScreenshot ts= (TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    String path="C:\\Users\\MANGESH PC\\eclipse-workspace\\SeleniumAutomationTesting\\Screenshot\\";
	    
	    File des=new File(path+filename+".png");
	    FileHandler.copy(src, des);
	 }
   public static void set(String browser)
   {
	   if(browser.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "D:\\BrowserDriver\\chromedriver.exe");
			
	   }
	   else if(browser.equals("edge"))
	   {
		   System.setProperty("webdriver.edge.driver","D:\\BrowserDriver\\msedgedriver.exe");
	   }
	   else if(browser.equals("mozila"))
	   {
		   System.setProperty("webdriver.gecko.driver", "D:\\BrowserDriver\\geckodriver.exe");
	   }
	   else
	   {
		   
	   }
		   
		   
	   
	   
	   
   }
}
