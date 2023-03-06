package com.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute {


   public static void main(String[] args) {
			
	WebDriver driver;
	String applicationurlAddress="https://www.google.com/search?q=google+home+page&rlz=1C1ONGR_enIN1030IN1030&oq=&aqs=chrome.0.69i59i450l8.65002j0j7&sourceid=chrome&ie=UTF-8";
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(applicationurlAddress);
	By signINL=By.linkText("Sign in");
	WebElement signIn=driver.findElement(signINL);
	String SignInElementText =signIn.getText();
    System.out.println("The text of an Element is:"+SignInElementText);
    String SingINclassAttributevalue=signIn.getAttribute("class");
    System.out.println("The class attribute value of signIN element is:"+SingINclassAttributevalue);
   String SignInHrebutrvalue=signIn.getAttribute("href");
   System.out.println("The href Attribute value of signIn Element is:"+SignInHrebutrvalue);
   signIn.click();
   driver.quit();
   
   
   
   
   
   
   
   
   }




}
