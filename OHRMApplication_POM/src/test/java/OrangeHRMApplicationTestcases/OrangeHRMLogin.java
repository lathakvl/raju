package OrangeHRMApplicationTestcases;

import org.testng.annotations.Test;

import OHRMApp.OHRMApplication_POM.BaseTest;
import OHRMApplicationpages.OrangeHRMloginpage;

public class OrangeHRMLogin extends BaseTest {

	OrangeHRMloginpage lip;

	@Test(priority=1,description=" validating OrangeHRM Application LogIN Page Logo Test ")
	public void logInPageLogoValidationTest()
	{
	lip= new OrangeHRMloginpage();
	lip.logInPageLogoValidation();
	}

	@Test(priority=2,description=" validating OrangeHRM Application LogIN Page Text Test ")
	public void logInPageTextValidationTest()
	{
	lip= new OrangeHRMloginpage();
	lip.logInPageTextValidation();
	}

	@Test(priority=3,description=" validating OrangeHRM Application LogIN Page LogIn Funcationality Test ")
	public void logInPageLogInFuncationalityTest()
	{
	lip= new OrangeHRMloginpage();
	lip.logInPageLogInFuncationality("Krishnaveni", "Kittu@123");
	}
	
}
