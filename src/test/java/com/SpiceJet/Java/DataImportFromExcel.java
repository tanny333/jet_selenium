package com.SpiceJet.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataImportFromExcel {
	
	
	public String baseURL=null;
	public String leaveingFrom=null;
	public String goingTo=null;
	
	public DataImportFromExcel(){
		ReadDataFromExcel();
	}
	
	
	public void ReadDataFromExcel(){
		
		try {
			FileInputStream FIS = new FileInputStream("/Users/user2/Newton/SpiceJet/src/Data/Workbook1.xlsx");
			XSSFWorkbook xssfWorkbook = new XSSFWorkbook(FIS);
			XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
			XSSFRow row = xssfSheet.getRow(1);
			
			baseURL = row.getCell(0).getStringCellValue();
			leaveingFrom = row.getCell(1).getStringCellValue();
			goingTo = row.getCell(2).getStringCellValue();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
