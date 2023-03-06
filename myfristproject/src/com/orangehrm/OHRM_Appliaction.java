package com.orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OHRM_Appliaction {
    public static void main(String[] args) {
		//Automation Broswer			
    	WebDriver driver;
        String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
        System.setProperty("webdriver.chrome.driver","./ChromeDriver_110v/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(applicationurlAddress);
      //Navigate to orange HRM application
        String expected_url_AddressoforangeHRMApplicationpage="http://127.0.0.1/orangehrm-4.2.0.1/";
        System.out.println("The expected url Address of orangeHRMApplicationLogINpage is:"+expected_url_AddressoforangeHRMApplicationpage);
        String actual_urlAddressoforangeHRMapplicationwedpage=driver.getCurrentUrl();
        System.out.println("The actual_urlAddressoforangeHRMApplicationLogInpage is:"+actual_urlAddressoforangeHRMapplicationwedpage);
        if(actual_urlAddressoforangeHRMapplicationwedpage.contains(expected_url_AddressoforangeHRMApplicationpage))
        {
       System.out.println("Its a Login page of orange HRM application_URL Address matched pass");
        }
        else
        {
       System.out.println("Its NoT a Login page of orange HRM application_URL Address not matched_fail");
        }
       
        String expected_TitleoforangeHrmapplicationLogInpage="OrangeHRM";
        System.out.println("The expected Title of the orangeHRMApplicationLogINpage is:"+expected_TitleoforangeHrmapplicationLogInpage);
       String actual_TitleorangeHRMApplicationLogINpage=driver.getTitle();
       System.out.println("The actual Title og the orangeHRMApplicationwebpage is:"+actual_TitleorangeHRMApplicationLogINpage);
      if(actual_TitleorangeHRMApplicationLogINpage.equals(expected_TitleoforangeHrmapplicationLogInpage)) 
   		   {
          System.out.println("Its aLogIn page of orangeHrm Application-pass");
   		   }
      else
      {
         System.out.println("Its NoT aLogIn page of orangeHrm Application-fail");
         
      }
      
      //Validating Login Panel Text before Login
      String expected_LoginPanelTextBeforeLogin="LOGIN Panel";
      System.out.println("The expected_textoforangehrmLoginpage is:"+expected_LoginPanelTextBeforeLogin);
      By loginPanelL=By.id("logInPanelHeading");
      WebElement actual_LoginPanelTextBeforeLoginElement=driver.findElement(loginPanelL);
      String actual_LoginPanelTextBeforeLogin=actual_LoginPanelTextBeforeLoginElement.getText();
      System.out.println("The actual_textoforangehrmLoginpage is:"+ actual_LoginPanelTextBeforeLogin);
         if(actual_LoginPanelTextBeforeLogin.equals(expected_LoginPanelTextBeforeLogin)) {
        	 
        	 System.out.println("Login Panel Text is matched - Pass");
        } else {
        	System.out.println("Login Panel Text is not matched - Fail");
        }  
     
        
        
       //login _with validate test data
      By usernameL=By.id("txtUsername");
      WebElement username=driver.findElement(usernameL);
      username.sendKeys("Krishnaveni");
      By passwordL=By.name("txtPassword");
      WebElement Password= driver.findElement(passwordL);
      Password.sendKeys("Kittu@123");
      By loginL=By.name("Submit");
      WebElement login =driver.findElement(loginL);
      login.click();
      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          
          
          
          By welcomeadminL=By.linkText("Welcome Admin");
          WebElement welcomeAdmin=driver.findElement(welcomeadminL);
          welcomeAdmin.click();
         
          WebDriverWait Wait=new WebDriverWait(driver,10);
          Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
          
          By logoutL=By.linkText("Logout"); 
          WebElement logout=driver.findElement(logoutL);
          
          String Loguouttext=logout.getText();
          System.out.println(Loguouttext);
          logout.click();
          
          //Validating Login Panel Text After Logout
          String expected_LoginPanelTextAfterLogout="LOGIN Panel";
          System.out.println("The expected_textoforangehrmLoginpage is:"+expected_LoginPanelTextAfterLogout);
          By loginpanelL=By.id("logInPanelHeading");
          WebElement actual_LoginPanelTextAfterLogoutElement=driver.findElement(loginpanelL);
          String actual_LoginPanelTextAfterLogout=actual_LoginPanelTextAfterLogoutElement.getText();
          System.out.println("The actual_textoforangehrmLoginpage is:"+ actual_LoginPanelTextAfterLogout);
             if(actual_LoginPanelTextAfterLogout.equals(expected_LoginPanelTextAfterLogout)) {
            	 
            	 System.out.println("Login Panel Text after Logout is matched - Pass");
            } else {
            	System.out.println("Login Panel Text after Logout is not matched - Fail");
            }  
       
          
          
          
           driver.quit();
        			
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 }






}
