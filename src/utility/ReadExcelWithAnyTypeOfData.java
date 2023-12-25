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
		
		

	}
	
	
	

}
