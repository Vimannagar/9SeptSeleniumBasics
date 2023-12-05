package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("typing using xpath");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	
		lastname.sendKeys("typing lastname");
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
	
		femaleRadioButton.click();
	
	}

}
