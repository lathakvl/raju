package loginfunctionalityofOrangeHRMapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcome_adimnlogout {
       public static void main(String[] args) {
		
    WebDriver driver;
    String applicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
    System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    //Navigate to orange HRM application
    driver.get(applicationurlAddress);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
      WebElement userNameElement=driver.findElement(By.id("txtUsername")) ;
      userNameElement.sendKeys("Krishnaveni");
      By passwordL=By.name("txtPassword");
      WebElement Password= driver.findElement(passwordL);
      Password.sendKeys("Kittu@123");
      By logInButtonL=By.className("button");
      WebElement logInButton=driver.findElement(logInButtonL);
      logInButton.click();
      
      By welcomeadminL=By.linkText("Welcome Admin");
      WebElement welcomeAdmin=driver.findElement(welcomeadminL);
      welcomeAdmin.click();
     
      WebDriverWait Wait=new WebDriverWait(driver,10);
      Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
      
      By logoutL=By.linkText("Logout"); 
      WebElement logout=driver.findElement(logoutL);
      logout.click();
     driver.quit();
       
       
       
       
       
       
       }
}
