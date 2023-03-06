package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class OrnageHRMApplicationMethods {
	
	public  WebDriver driver;
	String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@Given("^User should open chrome Browser in the system$")
	public void user_should_open_chrome_Browser_in_the_system()  {
		
		 System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	     driver=new ChromeDriver();   
	}

	@When("^User Enter OrangeHRM Application URL Address$")
	public void user_Enter_OrangeHRM_Application_URL_Address()  {
		    driver.get(applicationurlAddress);
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@Then("^User should be navigated to orangeHRM Application LogIn page$")
	public void user_should_be_navigated_to_orangeHRM_Application_LogIn_page()  {
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

	@Then("^User should be close the orangeHRM Application and the Browser$")
	public void user_should_be_close_the_orangeHRM_Application_and_the_Browser()  {
		driver.close();  
	}


}
