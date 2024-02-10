package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name = "testdata")
	public static String[][] readData() throws IOException
	{
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\datafordataprovider.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int rowCount = sh1.getLastRowNum()+1;
		
		System.out.println(rowCount);
		
		int columnCount = sh1.getRow(0).getLastCellNum();
		
		System.out.println(columnCount);
		
		String [][] data = new String [rowCount][columnCount];
		
		for(int i=0; i<rowCount; i++)
		{
			for(int j=0; j<columnCount; j++) {
				
			data[i][j]	= sh1.getRow(i).getCell(j).getStringCellValue();
			}
		}
			
		return data;
				
	}
	
	
}
