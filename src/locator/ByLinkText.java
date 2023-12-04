package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkText {
	
	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement privacyPolicyLink = driver.findElement(By.linkText("Privacy Policy"));	
		
		privacyPolicyLink.click();
	}

}
