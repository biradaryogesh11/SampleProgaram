package testNG_Annoatation;
import org.testng.annotations.Test;

public class TimeOutsKeywordPractice 
{
	@Test(timeOut=2000)
    public void abc()
    {
    	System.out.println("abc method");
    }
	
	@Test(timeOut=4000)
    public void mno()
    {
    	System.out.println("mno method");
    }
	
	@Test()
    public void xyz()
    {
    	System.out.println("xyz method");
}
}