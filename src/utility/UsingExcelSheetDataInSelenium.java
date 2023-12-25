package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingExcelSheetDataInSelenium {

	
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		ExcelReader er = new ExcelReader();
		
String firstnameValue = er.readData(2, 0);
		
		firstname.sendKeys(firstnameValue);
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	
		String lastnameValue = er.readData(2, 1); 
		
		lastname.sendKeys(lastnameValue);
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
	
		femaleRadioButton.click();
	}
}
