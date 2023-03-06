package OHRMBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest2 {

	public static WebDriver driver;
    String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    
    @BeforeTest
    public void applicationLaunch() throws IOException {
//    	FileInputStream logInTestDataFile=new FileInputStream("C:\\Users\\makke\\OneDrive\\Desktop\\krishnaveni\\OrangeHRMApplication\\src\\main\\java\\LogInTest.xlsx");
//		  XSSFWorkbook workBook=new XSSFWorkbook(logInTestDataFile);
//		  XSSFSheet sheet=workBook.getSheet("Sheet1");
    	
    System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    @AfterTest
    public void applicationclose()
	{
		driver.quit();
	}
    
   
   



}
