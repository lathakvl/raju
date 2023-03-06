package OHRMApplicationpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.log;

import OHRMApp.OHRMApplication_POM.BaseTest;

public class OrangeHRMloginpage extends BaseTest {

	public OrangeHRMloginpage() // its a constructor
	{
		PageFactory.initElements(driver, this);
	}

	// Should be written with Identification of Elements of the Webpage
	// Should be written with Business Logics(User Defined methods) - to perform
	// operation
	// on the Elements

	// Object Repository Class

	// WebElement
	// orangeHRMLogo=driver.findElementBy(xpath="//*[@id=\"divLogo\"]/img");

	@FindBy(xpath = "//*[@id=\"divLogo\"]/img")
	WebElement orangeHRMLogo;

	@FindBy(id = "logInPanelHeading")
	WebElement orangeHRMLogInPageText;

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(name = "txtPassword")
	WebElement password;

	@FindBy(className = "button")
	WebElement logInButton;

	public void logInPageLogoValidation() {
		boolean flag = orangeHRMLogo.isDisplayed();

		if (flag) {
			log.info("OrangeHRM Application logo found on OrangeHRM Application LogIn Page - PASS ");
		} else {
			log.info("OrangeHRM Application logo NOT found on OrangeHRM Application LogIn Page - FAIL ");
		}

	}

	public void logInPageTextValidation() {

		String expected_OrangeHRLApplicationLogInPageText = "LOGIN Panel";
		log.info("The expected LogIN Page Text is :- " + expected_OrangeHRLApplicationLogInPageText);

		String actual_OrangeHRLApplicationLogInPageText = orangeHRMLogInPageText.getText();
		log.info("The actual LogIn Page Text is :- " + actual_OrangeHRLApplicationLogInPageText);

		if (actual_OrangeHRLApplicationLogInPageText.equals(expected_OrangeHRLApplicationLogInPageText)) {
			log.info("Successfully navigated to OrangeHRM Application LogIN page - PASS");
		} else {
			log.info("Failed to navigat to OrangeHRM Application LogIn Page - FAIL");
		}

	}

	public void logInPageLogInFuncationality(String userNameTestData, String passwordTestData) {
		userName.sendKeys(userNameTestData);
		password.sendKeys(passwordTestData);
		logInButton.click();

	}

}
