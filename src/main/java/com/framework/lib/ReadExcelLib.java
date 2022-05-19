package com.framework.lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcelLib {
	
	public Object [] [] Get_Excel_Data(String filename, String sheetname, int numberofCols){
		
		File file = new File(filename);
		
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		
		Object [] [] arr = new Object [0][0];
		
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook= new XSSFWorkbook(excel);
			sheet = wkbook.getSheet(sheetname);
			int start = sheet.getFirstRowNum();
			int end = sheet.getLastRowNum();
			
			arr = new Object[end-start+1][numberofCols];
			for (int i= start; i<=end; i++) {
				for (int j=0; j<=numberofCols-1; j++) {
					arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
					
				}
			}
			
		}catch (Exception e) {

		System.out.println(e.getMessage());
		}
		
		return arr;
		
	}

}
