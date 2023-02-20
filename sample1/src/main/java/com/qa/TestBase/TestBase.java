package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase

{
	public static WebDriver driver;


	 @Parameters("browser")
	   @BeforeMethod
	   public void setProprty(@Optional("chrome") String br)
	   {

		   if(br.equalsIgnoreCase("chrome"))
		   {
			  WebDriverManager.chromedriver().setup();
			   driver= new ChromeDriver();
		   }
		   else if(br.equalsIgnoreCase("firefox"))
		   {
			  WebDriverManager.firefoxdriver().setup();
			   driver= new FirefoxDriver();
		   }
		   else if(br.equalsIgnoreCase("edge"))
		   {
			  WebDriverManager.edgedriver().setup();
			   driver= new EdgeDriver();
		   }
		   else
		   {
			   System.out.println("Plese enter correct URL");
		   }
		   driver.get("https://neostox.com/sign-in");
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// login Page
		   LoginPage l=new LoginPage();
		   l.entermobilenumber("9421366179");
		   l.clickOnSubmitbutton();
		   l.enter4DigitPin(br);
		   l.clickOnSubmit2();

}
}