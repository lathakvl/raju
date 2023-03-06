package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation3 {



	@BeforeMethod
	public void gmailApplicationLaunch()
	{
		System.out.println("***gmailApplicationLaunch successfully");
	}
	@AfterMethod
	public void gmailInBoxTest()
	{
		System.out.println("*** gamilInBox functionality Test executed successfully");
	}
	@Test(priority=3)
	public void gmailcomposemailTest()
	{
		System.out.println("***gamilcomposemailTest  executed successfully");
	}
	@Test(enabled=false)
	public void gamisentmailTest()
	{
		System.out.println("sentmail Funcationality Test Executed successfully");
	}
	@Test(priority=4)
	public void gmailDraftsTest()
	{
		System.out.println("Draft mail functionality Test executed successfully ");
	}

	@Test(priority=5)
	public void gmailapplicationclose()
	{
		System.out.println("***gmailapplicationcloseld successfully");
	}














}
