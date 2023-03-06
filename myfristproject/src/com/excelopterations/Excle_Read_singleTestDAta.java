package com.excelopterations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excle_Read_singleTestDAta {
public static void main(String[] args) throws IOException {
//Identify the file in the system
FileInputStream file=new FileInputStream("./src/com/excelopterations/Excel.xlsx");

//Indentify the Workbook in the File
XSSFWorkbook workBook=new XSSFWorkbook(file);

//identify the sheet in the workbook
XSSFSheet sheet =workBook.getSheet("sheet1");


//Indentify the Row in the shhet
Row row=sheet.getRow(0);

//Indentify the row of a cell
Cell cell=row.getCell(0);

//getting the data from the roe of a cell
String data=cell.getStringCellValue();
System.out.println(data);


}
}
