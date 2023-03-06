package com.webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
	String applicationurlAddress="https://www.timeanddate.com/worldclock/";
	

	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "ChromeDriver_110v/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationurlAddress);
//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	public void applicationclose()
	{
		driver.close();
	}

public static void main(String[] args) {
	BaseTest data= new BaseTest();
	data.applicationLaunch();
	data.applicationclose();			
			




}
}
