package testNG_Annoatation;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationKeywordPractice 
{
	@BeforeSuite
	public void suit()
	{
		System.out.println("Before suit");
	}
	@BeforeTest
	public void test()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void classs()
	{
		System.out.println("Before class");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("Before Method");
	}
	@Test
	public void test1()
	{
		System.out.println("test");
	}
	@Test
	public void abc()
	{
		System.out.println("abc Method");
	}
	@Test
	public void mno()
	{
		System.out.println("mno method");
	}
    
	@AfterSuite
	public void suitA()
	{
		System.out.println("After suit");
	}
	@AfterTest
	public void testA()
	{
		System.out.println("After test");	
	}
	@AfterClass
	public void classsA()
	{
		System.out.println("After Class");
	}
	@AfterMethod
	public void methodA()
	{
		System.out.println("After Method");
	}
}
