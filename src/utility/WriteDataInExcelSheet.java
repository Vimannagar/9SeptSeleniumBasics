package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelSheet {
	
	public static void main(String[] args) throws IOException {
		
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
//		To locate the workbook
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		File fout = new File(path);
		
		FileOutputStream fos = new FileOutputStream(fout);
		
		sh1.getRow(5).getCell(1).setCellValue("Write test in excel");// to write the data inside the excel sheet
		
		sh1.getRow(7).createCell(6).setCellValue("6th Cell value in 7th row");
		
		sh1.createRow(46).createCell(0).setCellValue("creating row and cell");
		
		
		
		wb.write(fos);// to save the data that we have written inside the excel sheet
		
		
		
		
		
		
	}

}
