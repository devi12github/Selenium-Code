package com.TestCases;

import org.apache.poi.xssf.usermodel.*;

public class CreateWorkbook {

	static XSSFWorkbook workbook;
	static XSSFRow row;
	static XSSFCell cell;
	static XSSFSheet sheet;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFSheet sheet = workbook.getSheet("sheet1");
	
	Object data[][] = {
                 
			 {"EmpID","Name","Job"},
				{ 101, "David", "manager"},
			    {102,"Smith", "Engineer"},
				{103,"Scot", "Tester"}
				
	};
	int rows = data.length;
	int colmns = data[0].length;
	
	for(int r=0;r<rows; r++) {
		row = sheet.createRow(r);
		for(int c=0;c<colmns;c++) {
			cell = row.createCell(c);
		Object value = data[r][c];
		
		
		
		}
	}
	
	
	}
	
	
	}


