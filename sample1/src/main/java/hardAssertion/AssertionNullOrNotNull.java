package hardAssertion;

import org.testng.Assert;

public class AssertionNullOrNotNull 
{
   String s=" ";
	public void yogesh()
	{
		System.out.println("yogesh method");
		System.out.println("yogesh method");
		Assert.assertNotNull(s);
		System.out.println("yogesh method");
		System.out.println("yogesh method");
	}
	public void somesh()
	{
		System.out.println("Somesh method");
		System.out.println("Somesh method");
		Assert.assertNull(s);
		System.out.println("Somesh method");
		System.out.println("Somesh method");
	}
	
	
	
}
