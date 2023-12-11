package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllValuesOfFacebookYearDropdown {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> yearValues = driver.findElements(By.xpath("//*[@id='year']//option"));
	
		
		for(WebElement yearValue:yearValues)
		{
			String value = yearValue.getText();
			System.out.println(value);
		}
	
	
	}

}
