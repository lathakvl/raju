package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingthelinksofTSRTCapplication {
public static void main(String[] args) {
	WebDriver driver;
   	String applicationurlAddress="https://www.tsrtconline.in/oprs-web/?ref=w3use";
   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
   	driver=new ChromeDriver();
   	driver.get(applicationurlAddress);
   	//Navigate to TSRTC Application
   	By tsrct_HeaderBlockL=By.className("menu-wrap");
    WebElement tsrct_HeaderBlock=driver.findElement(tsrct_HeaderBlockL);
    By headerBlockElementLocator=By.tagName("a");
    List<WebElement>headerBlockLinks=tsrct_HeaderBlock.findElements(headerBlockElementLocator);
    int headerBlockLinks_count=headerBlockLinks.size();
    System.out.println("The numeber of elements of type links in the Header "+"Block of TSRTC ApplicationHome are:"+headerBlockLinks_count);
   	for(int index=0;index<headerBlockLinks_count;index++)
    {
      String headerBlock_LinkName=headerBlockLinks.get(index).getText();
      System.out.println(index+""+headerBlock_LinkName);
     String expected_LinkurlAddress=headerBlockLinks.get(index).getAttribute("href");
     System.out.println("The Expected url Address of Link is:"+expected_LinkurlAddress);
     headerBlockLinks.get(index).click();
     System.out.println(driver.getTitle());
    
     //getting the current url address
     String actual_webpageurlAddress=driver.getCurrentUrl();
     System.out.println("The actual url Address after the links is clicked:"+actual_webpageurlAddress);
     if(actual_webpageurlAddress.equals(expected_LinkurlAddress))
     { 
	 System.out.println("successfully Navigated to the link webpage url Address-pass");

     }
     else
     {
       System.out.println("successfully Navigated to the link webpage url Address-fail");

     }
       driver.navigate().back();
       tsrct_HeaderBlock=driver.findElement(tsrct_HeaderBlockL);
       headerBlockLinks=tsrct_HeaderBlock.findElements(headerBlockElementLocator);




    

    }
driver.close();

}






}
