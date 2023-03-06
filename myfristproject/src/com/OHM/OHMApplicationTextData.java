package com.OHM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHMApplicationTextData {
 public static void main(String[] args) throws IOException {
	
	 WebDriver driver;
     String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
     System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
     driver=new ChromeDriver();
     driver.get(applicationurlAddress);
     //validating the Login page of orangeHRM Application
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
 String expected_url_AddressoforangeHRMApplicationpage="http://127.0.0.1/orangehrm-4.2.0.1/";
 System.out.println("The expected url Address of orangeHRMApplicationLogINpage is:"+expected_TitleoforangeHrmapplicationLogInpage);
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
 //Navigate To orangeHrm Application
  FileInputStream logInTestDataFile=new FileInputStream("./src/com/OHM/1.xlsx");
  XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);
  XSSFSheet sheet=workBook.getSheet("Sheet1");
  
  Row row=sheet.getRow(1);
  Cell userNameTestDataCell=row.getCell(0);
  String UserNameTestData=userNameTestDataCell.getStringCellValue();
  System.out.println("The UserName is:"+UserNameTestData);
  
  
 Cell PasswordTestDataCell=row.getCell(1) ;
 String PasswordTestData=PasswordTestDataCell.getStringCellValue();
 System.out.println("The Password is:"+PasswordTestData);
 
 
 By usernameL=By.id("txtUsername");
 WebElement username=driver.findElement(usernameL);
 username.sendKeys(UserNameTestData);
 
 By passwordL=By.name("txtPassword");
 WebElement Password= driver.findElement(passwordL);
 Password.sendKeys(PasswordTestData);

 By loginL=By.className("button");
 WebElement login =driver.findElement(loginL);
 login.click();
 //validating Homepage
 By WelcomeAdminLocater=By.id("welcome");
 WebElement welcomeAdmin=driver.findElement(WelcomeAdminLocater);
 String expected_orangeHRMApplicationHomepageText="Admin";
 String actual_orangeHRMApplicationHomepageText=welcomeAdmin.getText();
 if(actual_orangeHRMApplicationHomepageText.contains(expected_orangeHRMApplicationHomepageText))
 
 {
 System.out.println("Successfully Naviaged to home page-pass");
 
 Cell newRowofCell=row.createCell(2);
 newRowofCell.setCellValue("Successfully Naviaged to home page-pass");
 }
   else
 {
 
 System.out.println("Faild Naviaged to home page-FAIL");
 Cell newRowofCell=row.createCell(2);
 newRowofCell.setCellValue("Faild Naviaged to home page-FAIL");
 }
     FileOutputStream logInTestResultFile=new FileOutputStream("./src/com/OHM/1.xlsx");
      workBook.write(logInTestResultFile);
    welcomeAdmin.click();
 }
}
