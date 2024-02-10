package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImportantMethods {
	
	@Test
	public void conditionalMethods()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
		
		boolean isenable = firstname.isEnabled();
		
		System.out.println(isenable);
		
		
		WebElement signupButton = driver.findElement(By.xpath("//*[@name='websubmit']"));
	
		boolean isDisplaying = signupButton.isDisplayed();
		
		System.out.println(isDisplaying);//true
		
		WebElement maleRadioButton = driver.findElement(By.xpath("//*[@type='radio' and @value='2']"));
	
		boolean isSelected = maleRadioButton.isSelected();
		
		System.out.println(isSelected);
		
		maleRadioButton.click();
		
		boolean afterClick = maleRadioButton.isSelected();
		
		System.out.println(afterClick);
		
	}

}
