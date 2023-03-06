package com.GetTitle;



import org.openqa.selenium.chrome.ChromeDriver;

public class BingGetTitle {
   public static void main(String[] args) {
	//Automating Chrome Browser
	   System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
      //Navigating to bing application Home page
      driver.get("http://bing.com");
   String a=driver.getTitle();//getTitle()method is used to identify the title of the webpage
   //printing the identified title of the bing application Home page
   System.out.println("the title of the bing Home page is:-"+a);
   //closing the browser
   driver.close();
   
   
   }
	
	
	
}
