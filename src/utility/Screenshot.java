package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;// typecasting driver to the TakeScreenshot Interface
		
		File source = ts.getScreenshotAs(OutputType.FILE);// capturing the screenshot
		
		String path = "F:\\Desktop\\VimanNagar\\9 Sept\\CapturedScreenshots\\amazonpage.jpg"; // defining the path of system where we want to store the screenshot
		
		File file = new File(path);// To locate the path as system path
		
		FileHandler.copy(source, file);// To copy the screenshot to the defined path
		
		
	}

}
