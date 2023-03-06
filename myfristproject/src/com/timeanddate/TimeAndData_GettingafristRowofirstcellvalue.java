package com.timeanddate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeAndData_GettingafristRowofirstcellvalue {
	WebDriver driver;
    String applicationurlAddress="https://www.timeanddate.com/worldclock/";
    public void applicationLaunch()
    {
    System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
    driver=new ChromeDriver();
    driver.get(applicationurlAddress);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
    }
    public void getFirstRowofFirstcellvaliue()
    {
    By WebTableCityNmaeLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
    WebElement CityNameElemnt=driver.findElement(WebTableCityNmaeLocator);
    String cityName=CityNameElemnt.getText();
    System.out.println(cityName);
    }
    public void applicationclose()
    {
      driver.quit();
    }
   public static void main(String[] args) {
	   TimeAndData_GettingafristRowofirstcellvalue getData=new TimeAndData_GettingafristRowofirstcellvalue(); 
 
    getData.applicationLaunch();
    getData.getFirstRowofFirstcellvaliue();
    getData.applicationclose();
    
    
    
    
    
   }
    
    
    }