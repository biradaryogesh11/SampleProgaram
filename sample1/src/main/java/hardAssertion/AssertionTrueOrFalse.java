package hardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTrueOrFalse 
{
	@Test
   public void abc()
   {
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   Assert.assertFalse(5>2, "condition is passed");
	   System.out.println("a---------------");
	   System.out.println("a---------------");
   }
   @Test
   public void xyz()
   {
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   Assert.assertTrue(5>2, "condition is passed");
	   System.out.println("a---------------");
	   System.out.println("a---------------");
   }
   
   
}
