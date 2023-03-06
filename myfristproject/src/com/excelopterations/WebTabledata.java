package com.excelopterations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabledata {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		String ApplicationUrlAddress="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver_110v/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationUrlAddress);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
//-------------------------------------------------------------------------------------------------
		
		
		
		  FileInputStream file=new FileInputStream("./src/com/excelopterations/webtabledada.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		
		
		
		///html/body/div[5]/section[1]/div/section/div[1]/div
		///html/body/div[5]/section[1]/div/section/div[1]/div
		
		
		
		WebElement webTable=driver.findElement(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div"));
		List<WebElement>tablerows=webTable.findElements(By.tagName("tr"));
		int tablerows_length=tablerows.size();
		System.out.println(tablerows_length);
		String data=webTable.getText();
		System.out.println(data);
		
		for(int i=0;i<tablerows_length;i++)
		{
			Row row=sheet.createRow(i);
			
			List<WebElement>tablecells=tablerows.get(i).findElements(By.tagName("td"));
			int tablecells_length=tablecells.size();
			System.out.println(tablecells_length);
			
			for(int j=0;j<tablecells_length;j++)
			{
				Cell cell=row.createCell(j);
				
				String data1=tablecells.get(j).getText();
				System.out.println(data1);
				
				cell.setCellValue(data1);
				
			}		
			}
		
		FileOutputStream file1=new FileOutputStream("./src/com/excelopterations/webtabledada.xlsx");
		workbook.write(file1);
		
		
		
	}

}
