package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayedmethod {
   public static void main(String[] args) {
	   WebDriver driver;
	   	String applicationurlAddress="https://www.valuelabs.com/";
	   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	   	driver=new ChromeDriver();
	   	driver.get(applicationurlAddress);
	   	//Navigate to valuelabs Homepage
	   	//identify the headerBlock
	   	By headerBlockLocator=By.id("navbarSupportedContent");
	   	WebElement headerBlock= driver.findElement(headerBlockLocator);
	   	//identifying the elements of the headerBlock
	   	By headerBlockLinkLocator=By.tagName("a");
	   	List<WebElement>hederBlockLinks=headerBlock.findElements(headerBlockLinkLocator);
	   	for(int index=0;index<hederBlockLinks.size();index++)
	   	{
	   	if(hederBlockLinks.get(index).isDisplayed())
	   	{
          String headerBlockLinkName=hederBlockLinks.get(index).getText();
          System.out.println(headerBlockLinkName);
	   	}
	   	}
   
   
   driver.quit();
   
   
   
   
   }







}
