package com.TestCases;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataProvider {

	
 static XSSFWorkbook workbook;
 static  XSSFSheet sheet;
 static XSSFRow row ;
  static XSSFCell cell;
  
  public static void main (String []args) throws Exception {
	   
	   File fis = new File ("C:\\Users\\usrah\\Desktop\\TestData.xlsx");
	   workbook = new  XSSFWorkbook(fis);
	   sheet = workbook.getSheetAt(0);
       int rows = sheet.getLastRowNum();
       String data = sheet.getRow(2).getCell(1).getStringCellValue();
   System.out.println(data);
   
     int colmns = sheet.getRow(0).getLastCellNum();
  
    for (int r=0;r<=rows;r++) {
      
    	row = sheet.getRow(r);
    	for (int c=0;c<colmns;c++) 
    	{
    		cell = row.getCell(c);
    	switch (cell.getCellType()) {
    	case STRING : System.out.println(cell.getStringCellValue());break;
    	case NUMERIC : System.out.println(cell.getNumericCellValue());break;
    	case BOOLEAN : System.out.println(cell.getBooleanCellValue());break;
    	
    	}
    	
    	}
  
  
    }
  }
}
  



