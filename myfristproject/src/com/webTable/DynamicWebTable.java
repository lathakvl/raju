package com.webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DynamicWebTable  extends BaseTest{
public void capturingDynamicWebTableData()
{
	By WebTableLocator=By.xpath("html/body/div[5]/section[1]/div/section/div[1]/div/table");
	WebElement webTable=driver.findElement(WebTableLocator);
	By tableRowLocator=By.tagName("tr"
			+ "");
	List<WebElement>tableRows=webTable.findElements(tableRowLocator);
	
	for(int rowIndex=0;rowIndex<tableRows.size();rowIndex++)
	{
	  By rowofCellLocator=By.tagName("td");
	  List<WebElement>tableRowofCells=tableRows.get(rowIndex).findElements(rowofCellLocator);
	for(int rowofCellIndex=0;rowofCellIndex<tableRowofCells.size();rowofCellIndex++)
	{ 
	String tableData=tableRowofCells.get(rowofCellIndex).getText();
	System.out.print(tableData+" ");
	}
	   System.out.println();
	
	}	  
}	  
	  
	public static void main(String[] args) {
		DynamicWebTable dynamicWebTable=new DynamicWebTable();
		dynamicWebTable.applicationLaunch();
		dynamicWebTable.capturingDynamicWebTableData();
		
		
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
	
	
	}  
	  
	  
}









