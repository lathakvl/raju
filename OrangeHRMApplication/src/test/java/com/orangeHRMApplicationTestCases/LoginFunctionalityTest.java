package com.orangeHRMApplicationTestCases;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.utility.ExcelCommonMethods;
import com.utility.Log4J;
import com.utility.Screenshort;
import com.utility.orangeHRMProperty;

import OHRMBase.BaseTest2;

public class LoginFunctionalityTest extends BaseTest2 {

	Properties Property;
	String excelFileInputpath = "C:\\Users\\makke\\OneDrive\\Desktop\\krishnaveni\\OrangeHRMApplication\\src\\main\\java\\LogInTest.xlsx";
	String excelFiloutputpath = "C:\\Users\\makke\\OneDrive\\Desktop\\krishnaveni\\OrangeHRMApplication\\src\\main\\java\\LogInTest (1).xlsx";
	String sheetName = "Sheet1";
	ExcelCommonMethods excelFile;

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

	private void logout() {

		By HomepageWelcomeAdminLocator = By.id(Property.getProperty("HomePageWelcomeproperty"));
		driver.findElement(HomepageWelcomeAdminLocator).click();

		By HomePageLogoutElementLocator = By.linkText(Property.getProperty("logoutLinkTextProperty"));
		driver.findElement(HomePageLogoutElementLocator).click();

	}

}
