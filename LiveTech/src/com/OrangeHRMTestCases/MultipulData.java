package com.OrangeHRMTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseTest;

public class MultipulData extends BaseTest	{
	
	
	@Test(priority=1)
	public void orangeHRM() throws InterruptedException, IOException
	{
	


								//			   /src/com/ApplicationTestDataFiles/MultipleData.xlsx
	FileInputStream file=new FileInputStream("./src/com/ApplicationTestDataFiles/MultipleData.xlsx");
    XSSFWorkbook workBook=new XSSFWorkbook(file);
    XSSFSheet sheet=workBook.getSheet("Sheet1");
 
    
    int TotalRows=sheet.getLastRowNum();
  
   for(int i=0;i<=TotalRows;i++){
	   
	   Row row=sheet.getRow(i);
	   Cell usernameCell=row.getCell(0);
	   String username=usernameCell.getStringCellValue();
	   Cell passwordCell=row.getCell(1);
	   String password=passwordCell.getStringCellValue();
	 
	   driver.findElement(By.id("txtUsername")).sendKeys(username);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
	   
	   driver.findElement(By.id("btnLogin")).click();
	  
	   String Expected_HomePageUrl="dashboard";
	   String Actual_HomePageUrl=driver.getCurrentUrl();
	   
	   if(Actual_HomePageUrl.contains(Expected_HomePageUrl)) {
		   
		   
	          By welcomeadminL=By.linkText("Welcome Admin");
	          WebElement welcomeAdmin=driver.findElement(welcomeadminL);
	          welcomeAdmin.click();
	         
	          WebDriverWait Wait=new WebDriverWait(driver,10);
	          Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
	          
	          By logoutL=By.linkText("Logout"); 
	          WebElement logout=driver.findElement(logoutL);
	          logout.click();
	          
	          System.out.println("Navigated to Home Page - Pass");
	          Cell ResultCell=row.createCell(2);
	          ResultCell.setCellValue("Pass");
	   }
   
	   else {
		  // String Expected_LoginPageUrl="validateCredentials";
		  // String Actual_LoginPageUrl=driver.getCurrentUrl();
		  // if(Actual_LoginPageUrl.contains(Expected_LoginPageUrl))
		  
		   
		   System.out.println("Inavalid Credentials - Fail");
		   Cell ResultCell=row.createCell(2);
	          ResultCell.setCellValue("Fail");
		   
		   Thread.sleep(3000);
		   
		   File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(screenshot, new File("./Sceenshots"+username+" "+password+".png"));
	   }
   }
	
		   
		   FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestDataFiles/MultipleData.xlsx");
	      workBook.write(file1); 
	      workBook.close();
	}
	   


}






























