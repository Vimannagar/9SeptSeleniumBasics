package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWithAnyTypeOfData {
	
	public static void main(String[] args) throws IOException {
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
//		To handle any type of data we need to create the object of DataFormatter class
		
		DataFormatter df = new DataFormatter();
		
		String data = df.formatCellValue(sh1.getRow(44).getCell(1));
				
		System.out.println(data);
		
		
		for(int i=0; i<45; i++)
		{
			String value = df.formatCellValue(sh1.getRow(i).getCell(1));
			
			System.out.println(value);
		}
		
		
//		To get the number of rows available inside the excel sheet
		
	int totalNumberOfRows = sh1.getLastRowNum();
	
	System.out.println("Total number of rows are "+totalNumberOfRows);//Total number of rows are 44
	
	int actualRowCount = totalNumberOfRows +1;
	
	System.out.println("Actual number of rows are "+actualRowCount);//45
	
//	To get the number of columns available inside the excel sheet
	
	int columnCount = sh1.getRow(0).getLastCellNum();
	
	System.out.println(columnCount);

	}
	
	
	

}
