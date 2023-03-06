package com.links;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver;				 
	 String applicationurlAddress="https://www.tsrtconline.in/oprs-web/?ref=w3use";	
	 
	 System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(applicationurlAddress);				
	    //Navigate to TSRTC and maxinizing the browser
	   	//maxinize the beoswer
	   	driver.manage().window().maximize();
	   	By tsrtc_HeaderBlockL=By.className("menu-wrap");
	    WebElement tsrtc_HeaderBlock =driver.findElement(tsrtc_HeaderBlockL);
	    By headerBlockElementLocator=By.tagName("a");
	    List<WebElement>headerBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockElementLocator);
	    int headerBlockLinks_count=headerBlockLinks.size();
	    System.out.println("The numeber of elements of type links in the Header "+"Block of TSRTC ApplicationHome are:"+headerBlockLinks_count);
	    //getting the element names of the header Block
	    for(int index=0;index<headerBlockLinks_count;index++)
	    {
	      String headerBlock_LinkName=headerBlockLinks.get(index).getText();
	      System.out.println(index+""+headerBlock_LinkName);
	       headerBlockLinks.get(index).click();
	      //getting the tittle of the webpage
	       System.out.println(driver.getTitle());
	       //getting the current url address
	       System.out.println(driver.getCurrentUrl());
	       //since the driver focus is moved to next page
	       driver.navigate().back();
	       //once the driver is back to the webpage
	       tsrtc_HeaderBlock =driver.findElement(tsrtc_HeaderBlockL);
	      //Re-crating the arrayList
	       headerBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockElementLocator);
	   

           Thread.sleep(3000);
		   
		   File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(screenshot, new File("./Sceenshots"+headerBlock_LinkName+".png"));

	    }
	    }	    
}
