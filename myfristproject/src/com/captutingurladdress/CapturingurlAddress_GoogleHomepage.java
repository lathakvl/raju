package com.captutingurladdress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingurlAddress_GoogleHomepage {
   public static void main(String[] args) {
	 WebDriver driver;
     String applicationurlAddress="http://google.com";
     System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(applicationurlAddress);
   //getting the title of the Google Homepage
     String actual_GoogleHomepageTitle=driver.getCurrentUrl();
     System.out.println("The actual Google Homepage title is:"+actual_GoogleHomepageTitle);
   //getting the url Address of the current Wedpage_GoogleHomepage
     String actual_GoogleHomepageCurrenturlAddress=driver.getCurrentUrl();
     System.out.println("The current url Address of the Google Home page is:"+actual_GoogleHomepageCurrenturlAddress);
     driver.close();
   
   
   
   }





}
