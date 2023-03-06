package com.OrangeHRMTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

import com.OrangeHRM.BaseTest;

public class OrangeHRMAddEmployeeList extends BaseTest {
	@Test(priority=1)
	public void orangeHRM() throws InterruptedException, IOException
	{
    driver.findElement(By.name("txtUsername")).sendKeys("Krishnaveni");
	driver.findElement(By.name("txtPassword")).sendKeys("Kittu@123");
	
	 WebElement loginbutton=driver.findElement(By.className("button"));
	 loginbutton.click();
	 
	 WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
	// welcomeAdmin.click();
	 
	 //WebElement logout=driver.findElement(By.linkText("Logout"));
	 //logout.click();
	 
	    WebElement pimElment=driver.findElement(By.id("menu_pim_viewPimModule")); 
	 
	 Actions action=new Actions(driver);
	 action.moveToElement(pimElment).build().perform();
	 //action.sendKeys(Keys.TAB).build().perform();
	 Thread.sleep(10000);
	 //action.sendKeys(Keys.ENTER).build().perform();
	 
	 WebElement addEmployee=driver.findElement(By.id("menu_pim_viewEmployeeList"));
	 addEmployee.click();
	 FileInputStream file=new FileInputStream("./src/com/OrangeHRMTestCases/LogInTest.xlsx");
	 XSSFWorkbook workbook=new XSSFWorkbook(file);
	 XSSFSheet sheet=workbook.getSheet("sheet2");
	 ///html/body/div[1]/div[3]/div[2]/divxs
	 ////*[@id="search-results"]/div
	 
	 WebElement addEmployeelist=driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div"));
	 List<WebElement>tablerows=addEmployeelist.findElements(By.tagName("tr"));
	 int tablerows_length=tablerows.size();
	 System.out.println(tablerows_length);
	 String data=addEmployeelist.getText();
	 System.out.println(data);
	 
	 for(int i=0;i<tablerows_length;i++)
	 {
		 
		 Row row=sheet.createRow(i);
		 
		 List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
		 int tablecells_length=tablecells.size();
		 System.out.println(tablecells_length);
		 
		 
		 for(int j=0;j<tablecells_length;j++)
		 {
			 Cell cell=row.createCell(j);
			 
			 String data1=tablecells.get(j).getText();
			 System.out.println(data1);
			 cell.setCellValue(data1);
		 }
		 
		 
		 FileOutputStream file1=new FileOutputStream("./src/com/OrangeHRMTestCases/LogInTest.xlsx");
		 workbook.write(file1);
		 
		 
	 }
	 
	
}

}















