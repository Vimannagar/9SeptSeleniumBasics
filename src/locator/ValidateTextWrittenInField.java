package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTextWrittenInField {
	
	
	@Test
	public void validateText()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("Velocity");
		
		String textWrittenInsideTheField = firstname.getAttribute("value");
		
		Assert.assertEquals(textWrittenInsideTheField, "Velocity");
		System.out.println(textWrittenInsideTheField);
	}

}
