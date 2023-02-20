package com.qa.groupTest;

import org.testng.annotations.Test;

public class GroupTest
{
	@Test(groups= {"sanity","regression"})
	public void test1()
	{
		System.out.println("test1");
	}

	@Test(groups= {"functional","regression"})
	public void test2()
	{
		System.out.println("test2");
	}

	@Test(groups= {"sanity","functional"})
	public void test3()
	{
		System.out.println("test3");
	}

}
