package com.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.*;

public class ReadFiles {

	static XSSFWorkbook workbook;
	static XSSFRow row;
	static XSSFCell cell;
	static XSSFSheet sheet;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	File fi = new File("C:\\Users\\usrah\\Desktop\\datafiles.xlsx");
	workbook = new XSSFWorkbook(fi);
	sheet = workbook.getSheetAt(0);
	int rows = sheet.getLastRowNum();
	int colmns = sheet.getRow(0).getLastCellNum();
	for (int r=0;r<=rows;r++) {
		row = sheet.getRow(r);
		for(int c=0;c<colmns;c++) {
			cell = row.getCell(c);
		switch(cell.getCellType()){
		case STRING:System.out.println(cell.getStringCellValue());break;
		case NUMERIC:System.out.print(cell.getNumericCellValue());break;
		
			}
		System.out.println("|");
		}
		System.out.println();
	}
	
	
	 
	
	}

}
