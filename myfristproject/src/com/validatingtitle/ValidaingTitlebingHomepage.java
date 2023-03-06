package com.validatingtitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidaingTitlebingHomepage {
 

public static void main(String[] args, String bingHomePageTitle) {
	//Automation chrome Browser
	 System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    //Navigating to Bing application Homepage
    driver.get("http://bing.com");
    //clinet Requirment the title of bing Homepage should be bing
    String expectedBingHomepageTitle="bing";
    //client required saved into avalidate
   System.out.println("The expected title of bing Home page is:"+expectedBingHomepageTitle);
	//getting the title of the Bing Homepage-developed By the Developer
   String AcutalBingHomepageTitle=driver.getTitle();
   System.out.println("The Actual tittle of Bring Homepage is:"+AcutalBingHomepageTitle);
   //Validating the Title of the Bing Homepage
 if (AcutalBingHomepageTitle.equals(expectedBingHomepageTitle))
    {	
    System.out.println("Both the actual and Expected BingHomepageTitle are the same-pass");
     
    }
     else
    
     {
        
   System.out.println("Both the actual and expeted Bing HomepageTitle are Not the same-fail");
}
   //driver.close();
   driver.quit();
  
}
}
