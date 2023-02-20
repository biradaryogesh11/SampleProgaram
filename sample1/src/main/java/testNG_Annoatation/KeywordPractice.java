package testNG_Annoatation;
import org.testng.annotations.Test;

public class KeywordPractice 
{  
	@Test(priority=4)
    public void method1()
    {
    System.out.println("Method1");
    }

    @Test(priority=1)
    public void method2()
    {
	System.out.println("Method2");
    }
    
    @Test(priority=-2)
    public void method3()
    {
    	System.out.println("Method3");
    }
    
    @Test
    public void method4()
    {
    	System.out.println("Method4");
    }
    
    
    
    
}
