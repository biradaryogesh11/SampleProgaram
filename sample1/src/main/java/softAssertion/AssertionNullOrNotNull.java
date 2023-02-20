package softAssertion;


import org.testng.asserts.SoftAssert;

public class AssertionNullOrNotNull 
{
	SoftAssert soft= new SoftAssert();
    String s=" ";
	public void yogesh()
	{
		System.out.println("yogesh method");
		System.out.println("yogesh method");
		soft.assertNotNull(s);
		System.out.println("yogesh method");
		System.out.println("yogesh method");
		soft.assertAll();
	}
	public void somesh()
	{
		System.out.println("Somesh method");
		System.out.println("Somesh method");
		soft.assertNull(s);
		System.out.println("Somesh method");
		System.out.println("Somesh method");
		soft.assertAll();
	}
	
	
	
}
