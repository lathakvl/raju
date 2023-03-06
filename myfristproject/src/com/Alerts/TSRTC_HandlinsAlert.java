package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HandlinsAlert {
 public static void main(String[] args) {
	    WebDriver driver;
	   	String applicationurlAddress="https://www.tsrtconline.in/oprs-web/?ref=w3use";
	   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	   	driver=new ChromeDriver();
	   	driver.get(applicationurlAddress);
	   	//navigate to TSRTC application Homepage
	   	//Automating check Availability Element
	   	By checkAvailabilityLoacator=By.id("searchBtn");
	   	WebElement checkAvailability= driver.findElement(checkAvailabilityLoacator);
	   	checkAvailability.click();
	   	
	   	Alert alert=driver.switchTo().alert();
	   	alert.accept();
	
 
      
      
      
      }

}
