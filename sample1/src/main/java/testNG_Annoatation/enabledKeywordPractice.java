package testNG_Annoatation;
import org.testng.annotations.Test;

public class enabledKeywordPractice 
{
	@Test(enabled=false)
    public void abc()
    {
    	System.out.println("abc method");
    }
	
	@Test()
    public void mno()
    {
    	System.out.println("mno method");
    }
	
	@Test(enabled=false)
    public void xyz()
    {
    	System.out.println("xyz method");
	}	
	
}
