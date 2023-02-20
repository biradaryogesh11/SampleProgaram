package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	public static void main(String args[]) throws IOException
	{

		String path = "E:\\Project1\\DalalstreetProject1\\excelsheet\\Book1.xlsx";
		
		File file= new File(path);
		System.out.println(file.exists());
//		FileInputStream fis= new FileInputStream(file);
//		XSSFWorkbook wb= new XSSFWorkbook (fis);
//		XSSFSheet sheet=wb.getSheetAt(0);
//		int rowcount = sheet.getPhysicalNumberOfRows();
//		int cellcount = sheet.getRow(0).getLastCellNum();
//        
//		for(int i=1;i<rowcount;i++)
//		{
//			for(int j=0;j<cellcount;j++)
//			{
//				String data = sheet.getRow(i).getCell(j).getStringCellValue();
//				System.out.println(data);
//			}
//			System.out.println();
//		}
//
//		wb.close();
//		fis.close();
}
}