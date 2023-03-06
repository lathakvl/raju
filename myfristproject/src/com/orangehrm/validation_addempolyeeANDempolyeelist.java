package com.orangehrm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class validation_addempolyeeANDempolyeelist {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
    String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    System.setProperty("webdriver.chrome.driver","./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    
    By usernameL=By.id("txtUsername");
    WebElement username=driver.findElement(usernameL);
    username.sendKeys("Krishnaveni");
    By passwordL=By.name("txtPassword");
    WebElement Password= driver.findElement(passwordL);
    Password.sendKeys("Kittu@123");
    By loginL=By.name("Submit");
    WebElement login =driver.findElement(loginL);
    login.click();
    
    
    By pimlocator=By.id("menu_pim_viewPimModule");
   	WebElement helloSignIn=driver.findElement(pimlocator);
   	Actions action=new Actions(driver);
   	action.moveToElement(helloSignIn).build().perform();
	
   	
   	
   	
   	By Addempolyee=By.id("menu_pim_addEmployee");
    WebElement AddempolyeeL=driver.findElement(Addempolyee);
    AddempolyeeL.sendKeys("Add Employee");  
    AddempolyeeL.click();
	//navigate to frist name
   	By fristname=By.id("firstName");
    WebElement fristnameL=driver.findElement(fristname);
    fristnameL.sendKeys("krishnaveni");
    //navigate to middle name
    By Middlename=By.id("middleName");
    WebElement MiddlenameL= driver.findElement(Middlename);
    MiddlenameL.sendKeys("krishna");
    //navigate to last name
    By lastname=By.name("lastName");
    WebElement lastnameL =driver.findElement(lastname);
    lastnameL.sendKeys("makkena");
    lastnameL.click();
    //navigate to save button
	By save=By.id("btnSave");
	WebElement saveL=driver.findElement(save);
	saveL.click();
     //validating the fristname
	
    Thread.sleep(1000);
    
	String expected_fristnameoforangeHRMApplicationadminpage="personal_txtEmpFirstName";
    System.out.println("The expect fristname of orangeHRMApplicationpage is:"+expected_fristnameoforangeHRMApplicationadminpage);
    String actual_fristnameAddressoforangeHRMapplicationwedpage=driver.getCurrentUrl();
    System.out.println("The actual_fristnameoforangeHRMApplicationwebpage is:"+actual_fristnameAddressoforangeHRMapplicationwedpage);
    if(expected_fristnameoforangeHRMApplicationadminpage.contains(expected_fristnameoforangeHRMApplicationadminpage))
    {
   System.out.println("Its pim page of orange HRM application_fristname matched pass");
    }
    else
    {
   System.out.println("Its NoT pim page of orange HRM application_fristnamenot matched_fail");
    }
    
    //validating the middle name
   
    String expected_middlenameoforangeHRMApplicationadminpage="personal_txtEmpMiddleName";
    System.out.println("The expect middlename of orangeHRMApplicationpage is:"+expected_middlenameoforangeHRMApplicationadminpage);
    String actual_middlenameAddressoforangeHRMapplicationwedpage=driver.getCurrentUrl();
    System.out.println("The actual_fristnameoforangeHRMApplicationwebpage is:"+actual_fristnameAddressoforangeHRMapplicationwedpage);
    if(expected_fristnameoforangeHRMApplicationadminpage.contains(expected_fristnameoforangeHRMApplicationadminpage))
    {
   System.out.println("Its pim page of orange HRM application_middlename matched pass");
    }
    else
    {
   System.out.println("Its NoT pim page of orange HRM application_middlenamenot matched_fail");
    }
//validating last name
	
    String expected_lastnameoforangeHRMApplicationadminpage="personal_txtEmpMiddleName";
    System.out.println("The expect lastname of orangeHRMApplicationpage is:"+expected_lastnameoforangeHRMApplicationadminpage);
    String actual_lastnameAddressoforangeHRMapplicationwedpage=driver.getCurrentUrl();
    System.out.println("The actual_lastnameoforangeHRMApplicationwebpage is:"+actual_lastnameAddressoforangeHRMapplicationwedpage);
    if(expected_lastnameoforangeHRMApplicationadminpage.contains(expected_lastnameoforangeHRMApplicationadminpage))
    {
   System.out.println("Its pim page of orange HRM application_lastname matched pass");
    }
    else
    {
   System.out.println("Its NoT pim page of orange HRM application_lastnamenot matched_fail");
    }
	
	driver.quit();
	
	
	
	
	
	
	
	

     
	
	
	
	
	
	
	
}




}
