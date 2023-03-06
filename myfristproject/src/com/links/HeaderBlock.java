package com.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderBlock {
public static void main(String[] args) {
						
	WebDriver driver;
   	String applicationurlAddress="https://www.tsrtconline.in/oprs-web/?ref=w3use";
   	
   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
   	driver=new ChromeDriver();
   	driver.get(applicationurlAddress);				
    //Navigate to TSRTC and maxinizing the browser
   	//maxinize the beoswerh
   	
   	driver.manage().window().maximize();
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

}
   driver.close();
}

}
