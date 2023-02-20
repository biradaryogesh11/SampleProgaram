package parllelTesting;
 
import org.testng.annotations.Test;

public class Sample3 
{
	@Test
	public void test9()
	{
		System.out.println("test9  "+Thread.currentThread().getId());
	}
	@Test
	public void test10()
	{
		System.out.println("test10  "+Thread.currentThread().getId());
	}
	@Test
	public void test11()
	{
		System.out.println("test11  "+Thread.currentThread().getId());
	}
	@Test
	public void test12()
	{
		System.out.println("test12  "+Thread.currentThread().getId());
	}

}
