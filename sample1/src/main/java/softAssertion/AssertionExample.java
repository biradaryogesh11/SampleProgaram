package softAssertion;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample 
{
	// hard assert
	int a=20;
	int b=30;
	int expected=20;
	SoftAssert soft= new SoftAssert();
  @Test	
  public void abc()
  {   
	  System.out.println("1----------------");
	  System.out.println("2----------------");
	  soft.assertEquals(a, b);
	  System.out.println("3----------------");
	  System.out.println("4----------------");
	  soft.assertAll();
  }
  @Test
  public void mno()
  {
	  System.out.println("5----------------");
	  System.out.println("6----------------");
	 soft.assertNotEquals(a, b);
	  System.out.println("7----------------");
	  System.out.println("8----------------"); 
  }
  // if the actual and expected result doesn't match then your test case get failed and after that
//   flow of execution continue
  
}
