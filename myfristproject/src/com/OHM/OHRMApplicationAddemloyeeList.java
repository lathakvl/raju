package com.OHM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMApplicationAddemloyeeList {

public static void main(String[] args) {
	WebDriver driver;
	String ApplicationurlAddress="http://127.0.0.1/orangehrm-4.2.0.1/";
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
     
	driver=new ChromeDriver();
	driver.get(ApplicationurlAddress);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.id("txtUsername")).sendKeys("Krishnaveni");
	driver.findElement(By.id("txtPassword")).sendKeys("Kittu@123");
	WebElement loginbutton=driver.findElement(By.className("button"));
	loginbutton.click();
	
     By WelcomeL=By.id("welcome");
    WebElement Welcome=driver.findElement(WelcomeL);
    Welcome.click();

By PML=By.id("menu_pim_viewPimModule");
WebElement PM=driver.findElement(PML);
PM.click();

By AddEmployeeL=By.id("menu_pim_addEmployee");
WebElement AddEmployee=driver.findElement(AddEmployeeL);
AddEmployee.click();


By fristnameL=By.id("firstName");
WebElement fristname=driver.findElement(fristnameL);
fristname.click();

driver.findElement(By.id("firstName")).sendKeys("krishnaveni");
driver.findElement(By.id("middleName")).sendKeys("krishna");
driver.findElement(By.id("lastName")).sendKeys("makkena");












  //By LoginL=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a");
//WebElement login=driver.findElement(LoginL);
//login.click();






}












































}
