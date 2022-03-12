package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
 public ExcelDataProvider() throws Exception {
	 String excelpath="C:\\Users\\Dell\\eclipse-workspace\\Vision_Nov\\TestData\\Data.xlsx";
	 FileInputStream file=new FileInputStream(excelpath);
	 wb=new XSSFWorkbook(file);
	 
 }
	
 public String getStringData(String sheetname,int row,int column) {
	 return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
 }
}
