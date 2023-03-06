package com.Dragmetomytarget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuery_Draganddropopretion {
      public static void main(String[] args) {
		
    	WebDriver driver;
  	   	String applicationurlAddress="https://jqueryui.com/droppable/";
  	   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
  	   	driver=new ChromeDriver();
  	   	driver.get(applicationurlAddress);
       By JQueryFrameLacator=By.className("demo-frame");
       WebElement jQueryFrame=driver.findElement(JQueryFrameLacator);
       driver.switchTo().frame(jQueryFrame);
       By dragMeToMyTargetLocator=By.id("droppable");
       WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
       String dragMeToMyTargetText=dragMeToMyTarget.getText();
       System.out.println("The text of an element dragMeToMyTargetis:"+dragMeToMyTargetText);
      driver.quit();
      
      
      
      
      
      
      
      
      
      
      
      }





}
