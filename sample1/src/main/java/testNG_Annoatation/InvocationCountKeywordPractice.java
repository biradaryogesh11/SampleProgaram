package testNG_Annoatation;
import org.testng.annotations.Test;

public class InvocationCountKeywordPractice 
{
	@Test(invocationCount=4)
    public void method1()
    {
    System.out.println("Method1");
    }

    @Test(invocationCount=3)
    public void method2()
    {
	System.out.println("Method2");
    }
    
    @Test(invocationCount=2)
    public void method3()
    {
    	System.out.println("Method3");
    }
    
    @Test(invocationCount=1)
    public void method4()
    {
    	System.out.println("Method4");
    }
}
