package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintAllValueFromExcelSheet {
	
	public static void main(String[] args) throws IOException, InterruptedException {
String path = "F:\\Desktop\\VimanNagar\\9 Sept\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		DataFormatter df = new DataFormatter();
		
	int	totalRows = sh1.getLastRowNum()+1;
	
	int actualColumnCount = sh1.getRow(0).getLastCellNum();
		
		for(int i=0; i<totalRows; i++)
		{
			for(int j=0; j<actualColumnCount; j++)
			{
		
			String value = df.formatCellValue(sh1.getRow(i).getCell(j));
			
			System.out.println(value);
			}
		}
		
		
		
		
	}

}
