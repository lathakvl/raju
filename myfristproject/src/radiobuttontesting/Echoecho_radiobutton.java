package radiobuttontesting;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Echoecho_radiobutton {
WebDriver driver;
String applicationalurl="https://echoecho.com/htmlforms10.htm";
public void applicationlaunch()
{
   System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
   driver=new ChromeDriver();
   driver.get(applicationalurl);
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
}
public void radiobuttontest()throws InterruptedException
{
          By group1L=By.id("group1");
          List<WebElement>group1=driver.findElements(group1L);
         int group1radiobuttonscount=group1.size();
         System.out.println(group1radiobuttonscount);
         for(int radioindex=0;radioindex<=group1radiobuttonscount;radioindex++)
         {
          //click on the radio button
        	 group1.get(radioindex).getClass();
        for(int indexclickedstatus=0;indexclickedstatus<=group1radiobuttonscount;indexclickedstatus++)
        {    	 
          System.out.println(group1.get(indexclickedstatus).getAttribute("value")+" "+group1.get(indexclickedstatus).getAttribute("checked"));
        }	 
       System.out.println(); 	 
     }        	 
        	 
}     	 
        	 
  public void applicationclose()
  {
   driver.close();
  }
  public static void main(String[] args) throws InterruptedException
 {
     Echoecho_radiobutton radiobutton=new Echoecho_radiobutton();
     radiobutton.applicationlaunch();
     radiobutton.radiobuttontest();
     radiobutton.applicationclose();
  
  
  
  
 }
  }
  
  
  
  
  
  
  
  
  
        	 
        	 
