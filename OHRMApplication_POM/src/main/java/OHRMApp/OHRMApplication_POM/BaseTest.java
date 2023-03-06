package OHRMApp.OHRMApplication_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.log;

public class BaseTest {


	public static WebDriver driver;
    // OrangeHRM Application Url Address
String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

@BeforeMethod
public void setUp()
{
System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
driver = new ChromeDriver();

// System.out.println(" Chorme Browser Launched Successfully ");
log.info(" Chorme Browser Launched Successfully ");

driver.manage().deleteAllCookies();

driver.get(applicationUrlAddress);
//System.out.println(" Successfully Naviagated to OrangeHRM Application ");
log.info(" Successfully Naviagated to OrangeHRM Application ");

driver.manage().window().maximize();

// WebPage Load Time should be set
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

// waits for All the elements to be identified with the given property on the WebPage
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}


@AfterMethod
public void tearDown()
{
driver.quit();

//System.out.println(" OrangeHRM Application Closed successfully ");
log.info(" OrangeHRM Application Closed successfully ");
}





}
