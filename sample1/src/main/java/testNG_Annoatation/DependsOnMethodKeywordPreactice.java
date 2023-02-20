package testNG_Annoatation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodKeywordPreactice 
{
	@Test
   public void login()
   {
	  System.out.println(); 
	  Assert.fail();
   }
	
	@Test(priority=1,dependsOnMethods= {"login"})
	   public void home()
	   {
		   
	   }
	
	@Test(priority=3,dependsOnMethods= {"login"})
	   public void notification()
	   {
		   
	   }
	
	@Test(priority=3,dependsOnMethods= {"login"})
	   public void logout()
	   {
		   
	   }
	
	
	
}
