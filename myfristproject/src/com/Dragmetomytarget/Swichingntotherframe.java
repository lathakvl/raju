package com.Dragmetomytarget;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Swichingntotherframe {
public static void main(String[] args) {
        WebDriver driver;
	   	String applicationurlAddress="https://jqueryui.com/droppable/";
	   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	   	driver=new ChromeDriver();
	   	driver.get(applicationurlAddress);
	   	
	   WebElement frameblock=driver.findElement(By.className("demo-frame"));
	   	driver.switchTo().frame(frameblock);
	   	
	   	
       //Navigate to jquery Application
	   By dragMeToMyTargetLocator=By.id("draggable");
	   WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetLocator);
	   
	   String dragMeToMyTargetText=dragMeToMyTarget.getText();
	   System.out.println("The text of an element dragMeToMyTargetis:"+dragMeToMyTargetText);
	   //Drop here Element property
	   By dropHereLocater=By.id("droppable");
	   WebElement dropHere=driver.findElement(dropHereLocater);
	    
       Actions action=new Actions(driver);
       action.dragAndDrop(dragMeToMyTarget,dropHere).build().perform();
       
       driver.switchTo().defaultContent();
      By resizableLocator=By.linkText("Resizable");
      WebElement resizable=driver.findElement(resizableLocator);
      resizable.click();
      System.out.println(driver.getTitle());
      //driver.quit();



}





}
