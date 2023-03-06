package com.captutingurladdress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validaingthetitleof_googlehomepageandurlAddress {
 public static void main(String[] args) {
	 WebDriver driver;
     String applicationurlAddress="http://google.com";
     System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(applicationurlAddress);
   //Navigate to Google Application
     String expected_GoogleHomepageTitle="Google";
     System.out.println("The expected Title of Google Homepage is:"+expected_GoogleHomepageTitle);
     //getting the title of the Google Home page
     String actual_GooglehomepageTitle=driver.getTitle();
     System.out.println("The actual Google Home page title is :"+actual_GooglehomepageTitle);
     //validating Title of Google Home page
     if(actual_GooglehomepageTitle.equals(expected_GoogleHomepageTitle))
     {
     System.out.println("Google HomepageTitle Macted-pass");
     }
     else
     {
    System.out.println("Google HomepageTitle NOT Macted-fail");
     }
     String expected_GoogleHomepageurlAddress="google.com";
     System.out.println("The expected url Address of Google Homepage is:"+expected_GoogleHomepageurlAddress);
     //getting the uri Addres of the current webpage_GoogleHomepage
     String actual_GoogleHomepagecurrenturlAddress=driver.getCurrentUrl();
     System.out.println("The Actual current url Address of the Google Homepage is:"+actual_GoogleHomepagecurrenturlAddress);
      if(actual_GoogleHomepagecurrenturlAddress.contains(expected_GoogleHomepageurlAddress))
    { 
     System.out.println("The url address of the homepage matched-pass");
    }
    else
    {	
    System.out.println("The url address of the homepage not matched-fail ");
    }
    driver.close();
 
 
 
 }
}
