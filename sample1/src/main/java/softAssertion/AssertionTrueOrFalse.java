package softAssertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTrueOrFalse 
{
	SoftAssert soft= new SoftAssert();
	@Test
   public void abc()
   {
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   soft.assertFalse(5>2, "condition is passed");
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   soft.assertAll();
   }
   @Test
   public void xyz()
   {
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   soft.assertTrue(5>2, "condition is passed");
	   System.out.println("a---------------");
	   System.out.println("a---------------");
	   soft.assertAll();
   }
   
   
}
