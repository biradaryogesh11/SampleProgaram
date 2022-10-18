import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableHandling3 

{
	static String text;
	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoblaze.com/cart.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		List<WebElement> table_header = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped']//thead//th"));
		
		
		for(WebElement header:table_header)
		{
			 text = header.getText();
			 System.out.println("  |  "+text+"  |  ");
		}
		
		
		
		List<WebElement> tbody = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped']//tbody"));
		List<WebElement> row = driver.findElements(By.xpath("//tbody[@id='tbodyid']/tr"));
		System.out.println("No. of rows :"+row.size());
		System.out.println("No. of column :"+table_header.size());
		
		for( int r=1;r<=row.size();r++)
		{
			for(int c=1;c<=table_header.size();c++)
			{
				 String text1 = driver.findElement(By.xpath("//tbody[@id='tbodyid']//tr["+r+"]//td["+c+"]")).getText() ;
				 System.out.print (text1+"  ");
			}
			System.out.println();
		}
		
//		//tbody[@id='tbodyid']/tr[2]/td[2]
		
		
		
	}

}
