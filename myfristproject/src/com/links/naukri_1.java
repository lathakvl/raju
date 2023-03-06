package com.links;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class naukri_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver;
		String ApplicationurlAddress = "https://www.naukri.com/";
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(ApplicationurlAddress);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		By loginl = By.id("login_Layer");
		WebElement login = driver.findElement(loginl);
		login.click();

		By UsernameL = By.xpath("//form[@name=\"login-form\"]//input");// err-border
		List<WebElement> Username = driver.findElements(UsernameL);
		Username.get(0).sendKeys("makkenakrishnaveni887@gmail.com");
		Username.get(1).sendKeys("9966340484");

		By loginbuttonL = By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button");
		WebElement loginL = driver.findElement(loginbuttonL);
		loginL.click();

		By profileL = By.xpath("//div[@class=\"nI-gNb-drawer__bars\"]");
		WebElement profile = driver.findElement(profileL);
		profile.click();

		By viewprofileL = By.linkText("View & Update Profile");
		WebElement viewprofile = driver.findElement(viewprofileL);
		viewprofile.click();

		By updatereusmeL = By.xpath("//div[@class=\"uploadBtn\"]");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(updatereusmeL));
		
		WebElement updateresume = driver.findElement(updatereusmeL);
		updateresume.click();

	
		Runtime.getRuntime().exec("\"C:\\Users\\makke\\Desktop\\updateresume.exe\"");
		
		Thread.sleep(3000);
		
	//	By saveButtonLactor=By.id("btnSave");
	//	WebElement saveButton=driver.findElement(saveButtonLactor);
	//	saveButton.click();
		
		
		
		// validating the image uploaded
		// <input class="duplexBox" type="file" name="photofile" id="photofile">
	//	By emplyeePhotographLocator=By.id("empPic"); 
	//	WebElement employeephotograph=driver.findElement(emplyeePhotographLocator);
		  
		//  boolean flag=employeephotograph.isDisplayed();
	
	
	
	
	
	
	
	
	
	}

}
