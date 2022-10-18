

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Excel 
{
	public static String[][] main(String args[]) throws IOException
	{

		String path = "E:\\Project1\\sample1\\excelsheet\\Book1.xlsx";
		
		File file= new File(path);
//		System.out.println(file.exists());
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook (fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int cellcount = sheet.getRow(0).getLastCellNum();
        String [][] data=new String [rowcount-1][cellcount];
		for(int i=0;i<rowcount-1;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				DataFormatter df=new DataFormatter();
				data[i][j]= df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
			System.out.println();
		}
       
		wb.close();
		fis.close();
		return data;
}
}