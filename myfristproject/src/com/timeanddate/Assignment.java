package com.timeanddate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
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
     
		
   public void Firstcolumndata() throws IOException
   {
	   String xpath1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpath2 = "]/td[1]";
		By WebTableCityNameLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");
       List<WebElement>WebTableCityName=driver.findElements(WebTableCityNameLocator);	
       int citycount=WebTableCityName.size();
       System.out.println(citycount);  
		 for (int index=1;index<=citycount;index++) 
    {
    	
    	WebElement citynameelement = driver.findElement(By.xpath(xpath1+index+xpath2));
    	String cityName=citynameelement.getText();
    	System.out.println(cityName);
    	
    	
    	
     }
	 	 
	}
	public void applicationclose()
	{
	  driver.quit();
	}

	public static void main(String[] args) throws IOException
	{
		Assignment getData=new Assignment(); 
		getData.applicationLaunch();
		getData.Firstcolumndata();
		getData.applicationclose();
		
		
	}
	
	
	
   }
   
    
    

