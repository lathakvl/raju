package com.excelopterations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_data {
public static void main(String[] args) throws IOException {
	
	//Identify the file in the system
	FileInputStream file=new FileInputStream("./src/com/excelopterations/Excel.xlsx");

	//Indentify the Workbook in the File
	XSSFWorkbook workBook=new XSSFWorkbook(file);

	//identify the sheet in the workbook
	XSSFSheet sheet =workBook.getSheet("sheet1");
    Row row=sheet.createRow(2);
    Cell cell=row.createCell(3);
    cell.setCellValue("pavan");
    FileOutputStream file1=new FileOutputStream("./src/com/excelopterations/Excel.xlsx");
     workBook.write(file1);







}


}
