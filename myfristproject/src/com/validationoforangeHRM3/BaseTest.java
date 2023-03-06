package com.validationoforangeHRM3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseTest {

	

     WebDriver driver;
    String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    public void applicationLaunch() {
    	
    System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    driver.manage().window().maximize();
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
