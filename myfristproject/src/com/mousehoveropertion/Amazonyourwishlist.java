package com.mousehoveropertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonyourwishlist {
public static void main(String[] args) {
		
	WebDriver driver;
   	String applicationurlAddress="https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e";
   	System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
   	driver=new ChromeDriver();
   	driver.get(applicationurlAddress);	
   	//Navigate hello signIN Element
   	//Automating hello SignIn Element
   	By hellosignInlocator=By.id("nav-link-accountList");
   	WebElement helloSignIn=driver.findElement(hellosignInlocator);
   	Actions action=new Actions(driver);
   	action.moveToElement(helloSignIn).build().perform();
   	By yourwishListLocator=By.linkText("Your Wish List");
   	WebElement yourwishList=driver.findElement(yourwishListLocator);
   	yourwishList.click();
   	System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.quit();
    
    }




}
