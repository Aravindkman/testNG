package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {
	
	
	public void excelfile(String name,int index) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(name);
		
XSSFWorkbook workbk = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = workbk.getSheetAt(index);

	}
	
	
	
	public void particularcelldata(int rownum,int colnum) throws IOException {
		// TODO Auto-generated method stub
		
FileInputStream file = new FileInputStream("D:\\sel files\\testcasedatadriven.xlsx");
		
		XSSFWorkbook workbk = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = workbk.getSheetAt(0);
		
		XSSFCell cell = sheet.getRow(rownum).getCell(colnum);
		
		CellType type = cell.getCellType();
		
		if(type.equals(CellType.STRING))
		{
			System.out.println(cell.getStringCellValue());
		}
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			
			int c =(int)numericCellValue;
			
			System.out.println((String.valueOf(c)));
		}

	}
	
	
	
	
	public static void main(String[] args) throws IOException {
	
		Readexcelfile particularcell = new Readexcelfile();
		
		particularcell.particularcelldata(5, 4);
		
		
		FileInputStream file = new FileInputStream("D:\\sel files\\testcasedatadriven.xlsx");
		
		XSSFWorkbook workbk = new XSSFWorkbook(file);
		
		
		XSSFSheet sheet = workbk.getSheetAt(0);
		
		
		
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		
		
		int physicalNumberOfCells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		for(int i=0;i<physicalNumberOfRows;i++)
		{
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<physicalNumberOfCells;j++)
			{
				
			XSSFCell cell = row.getCell(j);	
				
			CellType type = cell.getCellType();
			
			if(type.equals(CellType.STRING))
			{
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.print("                          "+ stringCellValue);
			}
			else
			{
				
				double numericCellValue = cell.getNumericCellValue();
				
				int a = (int)numericCellValue;
				
				String valueOf = String.valueOf(a);
				
				System.out.print("                           "+ valueOf);
			} 
				
			
			}
			
			
			System.out.println();
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
