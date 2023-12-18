package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithMethod {
	
	
	public void captureScreenshot(WebDriver driver, String filename) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;// typecasting driver to the TakeScreenshot Interface

		File source = ts.getScreenshotAs(OutputType.FILE);// capturing the screenshot

		String path = System.getProperty("user.dir") + "//Screenshots//"+filename+".jpg";

		File file = new File(path);// To locate the path as system path

		FileHandler.copy(source, file);// To copy the screenshot to the defined path
		
	}

}
