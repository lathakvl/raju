package com.OrangeHRMTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseTest;

public class OrangeHRM_Loginpage extends BaseTest {
	
	@Test(priority=0)
	public void loginPanelText() throws IOException {
	


		
FileInputStream logInTestDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);
XSSFSheet sheet=workBook.getSheet("Sheet1");
		 
		  
		  
		   By loginLocator=By.id("logInPanelHeading");
		   WebElement Loginpan=driver.findElement(loginLocator);
		   String LoginPanelText=Loginpan.getText();
		   System.out.println(LoginPanelText);
		  
		  Row row=sheet.getRow(1);
		  Cell userNameTestDataCell=row.getCell(0);
		  userNameTestDataCell.setCellValue(LoginPanelText);
           Row ro=sheet.getRow(1);
           Cell actualcellvalue=row.createCell(2);
           actualcellvalue.setCellValue("pass");
	
		  
		  
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
  
	}

	
	
@Test(priority=1)
  public void inputs() throws IOException {
  FileInputStream logInTestDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
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
 

 FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
 workBook.write(file1); 
 workBook.close();
}
 

 @Test(priority=2)
 public void output() throws IOException {
	 FileInputStream logInTestDataFile=new FileInputStream("./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
			  XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);
			  XSSFSheet sheet=workBook.getSheet("Sheet1");
			 

  By welcomeadminL=By.linkText("Welcome Admin");
 WebElement welcomeAdmin=driver.findElement(welcomeadminL);
 welcomeAdmin.click();

 WebDriverWait Wait=new WebDriverWait(driver,10);
 Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
 
 By logoutL=By.linkText("Logout"); 
 WebElement logout=driver.findElement(logoutL);
 logout.click();
 
 
 FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
 workBook.write(file1); 
 workBook.close();
}
 
 
 
 
 
 }
  

 
 


 
 
 

 








	
















