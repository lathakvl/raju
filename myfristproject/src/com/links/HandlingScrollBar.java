package com.links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	WebDriver driver;
    String applicationurlAddress="https://www.tsrtconline.in/oprs-web/?ref=w3use";
    
    public void applicationLunch() {
     System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
     public void handlingscrollbar()
     {
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,200)");
     }  
      public static void main(String[] args)  {
		HandlingScrollBar obj=new HandlingScrollBar();
	   obj.applicationLunch();
	   obj.handlingscrollbar();
      
	  
	   
      }





}

