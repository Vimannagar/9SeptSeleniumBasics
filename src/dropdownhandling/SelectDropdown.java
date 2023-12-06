package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/signup");
		
		WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='day']"));
		
//		create the object of Select class
		
		Select selDay = new Select(dayDropdown);
		
		selDay.selectByVisibleText("14");
		
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select selMonth = new Select(monthDropdown);
		
		selMonth.selectByValue("9");
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selYear = new Select(yearDropdown);
		
		selYear.selectByIndex(6);
		
		
		
		dayDropdown.sendKeys("16");//based on manual behaviour we can also use SendKeys method to select the element
		
		
		
		
		
		
		
	}

}
