package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\TestData.xlsx";
		
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		
	}
	
	

}
