package com.captutingurladdress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
 public static void main(String[] args) {
	 WebDriver driver;
     String applicationurlAddress="https://www.facebook.com/";
     System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(applicationurlAddress);
     //validating the Login page of facebook Application
     String expected_TitleoffacebookapplicationLogInpage="facebook";
     System.out.println("The expected Title of the facebookApplicationLogINpage is:"+expected_TitleoffacebookapplicationLogInpage);
     String actual_TitlefacebookApplicationLogINpage=driver.getTitle();
     System.out.println("The actual Title og the facebookApplicationwebpage is:"+actual_TitlefacebookApplicationLogINpage);
     if(actual_TitlefacebookApplicationLogINpage.equals(expected_TitleoffacebookapplicationLogInpage)) 
		   {
       System.out.println("Its aLogIn page of facebook Application-pass");
		   }
   else
   {
      System.out.println("Its NoT aLogIn page of facebook Application-fail");
   }
     String expected_url_AddressoffacebookApplicationpage="https://www.facebook.com/";
    System.out.println("The expected url Address of facebookApplicationLogINpage is:"+expected_TitleoffacebookapplicationLogInpage);
    String actual_urlAddressoffacebookapplicationwedpage=driver.getCurrentUrl();
    System.out.println("The actual_urlAddressoffacebookApplicationLogInpage is:"+actual_urlAddressoffacebookapplicationwedpage);
  if(actual_urlAddressoffacebookapplicationwedpage.contains(expected_url_AddressoffacebookApplicationpage))
  {
   System.out.println("Its a Login page of facebook application_URL Address matched pass");
  }
  else
  {
   System.out.println("Its NoT a Login page of facebook application_URL Address not matched_fail");
  }
 //Testing the Login Functionality of facebook application
  //identifying the properties of username Element unde
  
  
  By usernameL= By.id("email");
  WebElement username=driver.findElement(usernameL);
  username.sendKeys("powerstaradp@gmail.com");
  By passwordL= By.name("pass");
  WebElement Password= driver.findElement(passwordL);
  Password.sendKeys("princeno1");
  By loginL= By.xpath("//button[@type='submit']");
  WebElement login =driver.findElement(loginL);
  login.click();
  
  
  

   //driver.findElement(By.name("txtpassword")).sendKeys("Happy@123");
  //<input type="submit"name="submit"class="id="button"value="LOGIN>"
 // driver.findElement(By.className("button")).click();
  //driver.quit();
  
 }
 

 
 
 
 
 
 
 
 
 
 }

