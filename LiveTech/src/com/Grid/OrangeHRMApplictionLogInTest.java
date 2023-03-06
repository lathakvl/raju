package com.Grid;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseTest;

public class OrangeHRMApplictionLogInTest extends BaseTest {

	public WebElement driver;

	@Parameters("Browser")
	@Test
	public void logInTest(String browserName) throws IOException

	{

		System.out.println("The Name of the Browser is" + browserName);
		DesiredCapabilities cap = null;
		if (browserName.equals("chrome")) {
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		} else

		if (browserName.equals("fixefox")) {
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.167.232:4444/wd/hub"), cap);

		String applicationurlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/";

		driver.get(applicationurlAddress);
		FileInputStream logInTestDataFile = new FileInputStream(
				"./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		By loginLocator = By.id("logInPanelHeading");
		WebElement Loginpan = driver.findElement(loginLocator);
		String LoginPanelText = Loginpan.getText();
		System.out.println(LoginPanelText);

		Row row = sheet.getRow(1);
		Cell userNameTestDataCell = row.getCell(1);
		userNameTestDataCell.setCellValue(LoginPanelText);
		Row row1 = sheet.getRow(1);
		Cell actualcellvalue = row1.createCell(2);
		actualcellvalue.setCellValue("pass");

		// validating the Login page of orangeHRM Application
		String expected_TitleoforangeHrmapplicationLogInpage = "OrangeHRM";
		System.out.println("The expected Title of the orangeHRMApplicationLogINpage is:"
				+ expected_TitleoforangeHrmapplicationLogInpage);
		String actual_TitleorangeHRMApplicationLogINpage = driver.getTitle();
		System.out.println(
				"The actual Title og the orangeHRMApplicationwebpage is:" + actual_TitleorangeHRMApplicationLogINpage);

		if (actual_TitleorangeHRMApplicationLogINpage.equals(expected_TitleoforangeHrmapplicationLogInpage)) {
			System.out.println("Its aLogIn page of orangeHrm Application-pass");
		} else {
			System.out.println("Its NoT aLogIn page of orangeHrm Application-fail");
		}

	}

	@Test(priority = 2)
	public void inputs() throws IOException {
		FileInputStream logInTestDataFile = new FileInputStream(
				"./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		Row row = sheet.getRow(1);
		Cell userNameTestDataCell = row.getCell(0);
		String UserNameTestData = userNameTestDataCell.getStringCellValue();
		System.out.println("The UserName is:" + UserNameTestData);

		Cell PasswordTestDataCell = row.getCell(1);
		String PasswordTestData = PasswordTestDataCell.getStringCellValue();
		System.out.println("The Password is:" + PasswordTestData);

		By usernameL = By.id("txtUsername");
		WebElement username = driver.findElement(usernameL);
		username.sendKeys(UserNameTestData);

		By passwordL = By.name("txtPassword");
		WebElement Password = driver.findElement(passwordL);
		Password.sendKeys(PasswordTestData);

		By loginL = By.id("btnLogin");
		WebElement login = driver.findElement(loginL);
		login.click();

		FileOutputStream file1 = new FileOutputStream(
				"./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
		workBook.write(file1);
		workBook.close();
	}

	@Test(priority = 3)
	public void output() throws IOException {
		FileInputStream logInTestDataFile = new FileInputStream(
				"./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
		XSSFSheet sheet = workBook.getSheet("Sheet1");

		By welcomeadminL = By.linkText("Welcome Admin");
		WebElement welcomeAdmin = driver.findElement(welcomeadminL);
		welcomeAdmin.click();

//WebDriverWait Wait=new WebDriverWait(driver,10);
//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));

		By logoutL = By.xpath("//a[text()='Logout']");
		WebElement logout = driver.findElement(logoutL);
		logout.click();

		FileOutputStream file1 = new FileOutputStream(
				"./src/com/ApplicationTestDataFiles/OHRM_LoginTestData.xlsx.xlsx");
		workBook.write(file1);
		workBook.close();
	}

}
