package com.links;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class naukri {
	public static void main(String[] args) throws InterruptedException {
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

		// *[@id="root"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button

		By searchjobsL = By.id("qsb-keyskill-sugg");
		WebElement Serachjobs = driver.findElement(searchjobsL);
		Serachjobs.sendKeys("SoftwareTesting");
		// qsb-location-sugg

		By SearchL = By.xpath("//*[@id=\"search-jobs\"]/button");
		WebElement Search = driver.findElement(SearchL);
		Search.click();

		By softwaretestingjobsL = By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/article[2]");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(softwaretestingjobsL));
		
		WebElement Automation = driver.findElement(softwaretestingjobsL);
		Automation.click();

		Set<String> newWindow =driver.getWindowHandles();
		String currentWindow = driver.getWindowHandle();
		String newWin=currentWindow;
		
		for (Iterator iterator = newWindow.iterator(); iterator.hasNext();) {
			
			String string = (String) iterator.next();
			if (!currentWindow.equals(string)) {
				newWin=string;
			}
			
		}
		
		driver.switchTo().window(newWin);
		
		By ApplybuttonL=By.xpath("//div[@class=\"apply-button-container\"]//button[text()=\"Apply\"]");
	    WebElement Applybutton=driver.findElement(ApplybuttonL);
        Applybutton.click();
	
      By FresherL=By.id("cstmExpY");
      WebElement Fresher=driver.findElement(FresherL);
      Fresher.click();
      
	Select select = new Select(Applybutton);

	
	
	
	
	}

}
