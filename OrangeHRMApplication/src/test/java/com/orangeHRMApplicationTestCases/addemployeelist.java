package com.orangeHRMApplicationTestCases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.utility.ExcelCommonMethods;
import com.utility.Log4J;
import com.utility.Screenshort;
import com.utility.orangeHRMProperty;

import OHRMBase.BaseTest2;

public class addemployeelist extends BaseTest2{

	Properties Property;
	String excelFileInputpath = "./src/main/java/LogInTest.xlsx";
	String excelFiloutputpath = "C:\\Users\\makke\\OneDrive\\Desktop\\krishnaveni\\OrangeHRMApplication\\src\\main\\java\\LogInTest (1).xlsx";
	String sheetName = "Sheet1";
	ExcelCommonMethods excelFile;
	WebDriver driver;
	@Test(priority = 1, description = "validating login page-LOGIN panel Text")
	public void validateLoginPageTest() throws IOException {

		excelFile = new ExcelCommonMethods(excelFileInputpath, excelFiloutputpath, sheetName);

		Property = orangeHRMProperty.loadproperty();// orangeHRMProperty
		// Property=Properties.loadproperty();//

		By loginpageLoginPanelTextLocator = By.id(Property.getProperty("loginpageHeaderText"));
		String actual_loginpageLoginPanelTextLocator = driver.findElement(loginpageLoginPanelTextLocator).getText();

		String Expected_loginpageLoginPanelTextLocator = excelFile.getcallvalue(1, 0);
		if (actual_loginpageLoginPanelTextLocator.equals(Expected_loginpageLoginPanelTextLocator)) {
			// Log4J
			// Log4J.info("");
			Log4J.info("Successfully navigated to the orange HRM Application-Pass");
			excelFile.setcellvalue(1, 15, "Successfully navigated to the Orange HRM Application-Pass");
		} else {
			Log4J.info("Failed to navigated to the Orange HRM Application-Fail");
			excelFile.setcellvalue(1, 2, "Failed to navigated to the Orange HRM Application-Fail");
			Screenshort.takescreenshot(driver, "error-name to navigated to OHRM");
			// TakesScreenshot.takescreenshot(driver, "error-name to navigated to OHRM");
		}
	}

	@Test(priority = 2, description = "Orange-OrangeHRMApplicationloginFunctionalityTest")
	public void validateLoginfunctionalityTest() throws IOException {
		int rowIndex = 1;
		while (true) {
			try {

				String userName = excelFile.getcallvalue(rowIndex, 9);
				String password = excelFile.getcallvalue(rowIndex, 10);

				By userNameElementLocator = By.id(Property.getProperty("UserNameProperty"));
				WebElement userNameElementElement = driver.findElement(userNameElementLocator);
				userNameElementElement.clear();
				userNameElementElement.sendKeys(userName);

				By passwordElementLocator = By.name(Property.getProperty("passwordProperty"));
				WebElement passwordElementLocatorl = driver.findElement(passwordElementLocator);
				passwordElementLocatorl.clear();
				passwordElementLocatorl.sendKeys(password);

				By loginpageLoginButtonLocator = By.className(Property.getProperty("loginButtonProperty"));
				driver.findElement(loginpageLoginButtonLocator).click();

				if (isLoginpage()) {
					Log4J.info("Failed to navigated to the Orange HRM Application-Fail");
					Screenshort.takescreenshot(driver, userName + password);
					excelFile.setcellvalue(rowIndex, 7, "Failed to navigated to the Orange HRM Application-Fail");
				} else {
					Log4J.info("Successfully navigated to the Orange HRM Application-Pass");
					validateHomepage();
					logout();
				}
				rowIndex++;

			} catch (Exception e) {
				break;
			}

			excelFile.saveExcelData();
		}
	}

	private boolean isLoginpage() {
		try {
			By loginPageInvalidMessegeLocator = By.id(Property.getProperty("loginpageInvalidErrormessage"));
			return driver.findElement(loginPageInvalidMessegeLocator).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	private void validateHomepage() throws IOException {

		int rowIndex = 1;

		String Expected_HomePageText = excelFile.getcallvalue(1, 11);
		By HomepageWelcomeAdminLocator = By.id(Property.getProperty("HomePageWelcomeproperty"));

		String Actual_HomePageText = driver.findElement(HomepageWelcomeAdminLocator).getText();

		excelFile.setcellvalue(1, 6, Actual_HomePageText);

		if (Actual_HomePageText.contains(Expected_HomePageText)) {

			Log4J.info("Successfully navigated to the Orange HRM Application HomePage-Pass");
			excelFile.setcellvalue(rowIndex, 7, "Successfully navigated to the Orange HRM Application HomePage-Pass");

		} else {

			Log4J.info("Failed navigated to the Orange HRM Application HomePage-Fail");
			Screenshort.takescreenshot(driver, "Failed to navigated Homepage");
		}

		}

	private void logout() throws IOException {

		By HomepageWelcomeAdminLocator = By.id(Property.getProperty("HomePageWelcomeproperty"));
		driver.findElement(HomepageWelcomeAdminLocator).click();

		By HomePageLogoutElementLocator = By.linkText(Property.getProperty("logoutLinkTextProperty"));
		driver.findElement(HomePageLogoutElementLocator).click();

	
		By pimlocator=By.id("AddEmplooyeListProperty");
	   	WebElement helloSignIn=driver.findElement(pimlocator);
	   	Actions action=new Actions(driver);
	   	action.moveToElement(helloSignIn).build().perform();
			
	   	
	   	WebElement addEmployee=driver.findElement(By.id("AddEmplooyeListProperty"));
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
