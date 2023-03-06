package com.validationoforangeHRM3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class orangeHRMAddEmployeTestNG 
{
	WebDriver driver;
@Test(priority=1)
public void orangeHRMAddEmployeTestNG()
{
	
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
    
	 
	 WebElement addEmployee=driver.findElement(By.id("menu_pim_viewEmployeeList"));
	 addEmployee.click();
	


}
@Test(priority=2)
public void getData()
{
	WebElement addEmployeelist=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
	List<WebElement>tablerows=addEmployeelist.findElements(By.tagName("tr"));
	 int tablerows_length=tablerows.size();
	 System.out.println(tablerows_length);
	// String data=addEmployeelist.getText();
	 //System.out.println(data);
	 
	 for(int i=0;i<tablerows_length;i++)
	 {
		 List<WebElement>tablerowofcoloum=tablerows.get(i).findElements(By.tagName("td"));
		 int tablerowofcoloum_length=tablerowofcoloum.size();
		 System.out.println(tablerowofcoloum_length);
    for(int j=0;j<tablerowofcoloum_length;j++)
{
    	String Data=tablerowofcoloum.get(j).getText();
    	System.out.println(Data+" ");
}
	 
	 
	 
	 }





}
}
