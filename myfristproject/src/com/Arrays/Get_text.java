package com.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text {
       public static void main(String[] args) {
		
			WebDriver driver;
			String applicationurlAddress = "https://www.google.com/search?q=google+home+page&rlz=1C1ONGR_enIN1030IN1030&oq=&aqs=chrome.0.69i59i450l8.65002j0j7&sourceid=chrome&ie=UTF-8";
			System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(applicationurlAddress);
			By signINL = By.linkText("Sign in");
			WebElement SignIn = driver.findElement(signINL);
			String SignInElementText = SignIn.getText();
			System.out.println("The text of an Element is:" + SignInElementText);
			SignIn.click();
			// driver.quit();

			// <a class="gb_7 gb_8 gb_de gb_dd"
			// href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/search%3Fq%3Dgoogle%2Bhomepage%26rlz%3D1C1ONGR_enIN1030IN1030%26oq%3Dg%26aqs%3Dchrome.0.69i59l2j46i131i199i433i465i512j69i57j69i59j0i131i433i512j69i60l2.1148j0j7%26sourceid%3Dchrome%26ie%3DUTF-8&amp;ec=GAZAAQ"
			// target="_top" waprocessedanchor="true">Sign in</a>

		}
	}
