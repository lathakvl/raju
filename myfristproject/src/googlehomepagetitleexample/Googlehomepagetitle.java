package googlehomepagetitleexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlehomepagetitle {
  
public static void main(String[] args) {
	//Automation chrome Browser
   System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
   //Navigating to Google application Home page
   WebDriver driver= new ChromeDriver();
   driver.get("http://google.com");
   String googlehomepagetitle="Google";
   System.out.println("The expected title of the Google  homepage:"+googlehomepagetitle);
   String AcutalGoogleHomepageTitle=driver.getTitle();
   System.out.println("The Actual tittle of Google Homepage is:"+googlehomepagetitle);
   String string1="Google";
   System.out.println("The string value string1 converted to upper case:"+string1);
    System.out.println(string1.charAt(0));
    char charAtindex=string1.charAt(0);
   System.out.println("the value of the variable charAt index is:"+charAtindex);
   
   if (AcutalGoogleHomepageTitle.equals(googlehomepagetitle))
   {	
   System.out.println("Both the actual and Expected GoogleHomepageTitle are the same-pass");
    
  }
    else
   
    {
       
  System.out.println("Both the actual and expeted Google HomepageTitle are Not the same-fail");
}
  //driver.close();
  driver.quit();
 
  
  
  
  }
}
