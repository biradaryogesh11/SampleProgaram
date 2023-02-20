package com.qa.groupTest;

import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

@Test(groups= {"all"})
public class NewTest extends TestBase
{
	@Test(groups= {"functional"})
	public void testA()
	{
		System.out.println("testA");
	}

	@Test(groups= {"functional","regression"})
	public void testB()
	{
		System.out.println("testB");
	}

	@Test(groups= {"functional"})
	public void testC()
	{
		System.out.println("testC");
	}

	@Test(groups= {"sanity"})
	public void testD()
	{
		System.out.println("testD");
	}

}
