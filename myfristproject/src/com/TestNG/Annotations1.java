package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {

@Test(priority=1)
public void gmailApplicationLaunch()
{
	System.out.println("***gmailApplicationLaunch successfully");
}
@Test(priority=2)
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
