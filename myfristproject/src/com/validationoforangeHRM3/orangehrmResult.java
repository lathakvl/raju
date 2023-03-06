package com.validationoforangeHRM3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangehrmResult {
public static void main(String[] args) throws IOException, InterruptedException {
	
	WebDriver driver;
    String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    
    
    
    
    
     //Navigate to validate&validate Data
    FileInputStream file=new FileInputStream("./src/com/validationoforangeHRM3/MultipleData.xlsx");
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
		  // if(Actual_LoginPageUrl.contains(Expected_LoginPageUrl)) {
		   
		   System.out.println("Inavalid Credentials - Fail");
		   Cell ResultCell=row.createCell(2);
	          ResultCell.setCellValue("Fail");
		   
		   Thread.sleep(3000);
		   
		   File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(screenshot, new File("./Sceenshots"+username+" "+password+".png"));
	   } 
	   }
		   
		   FileOutputStream file1=new FileOutputStream("./src/com/validationoforangeHRM3/MultipleData.xlsx");
	      workBook.write(file1); 
   }
	   
   }

 
   
   
   
   
   
 
    
    
    
   
   
   
    	
    
    
    
    
   



