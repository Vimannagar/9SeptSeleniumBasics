package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		
		String textOnPopup = driver.switchTo().alert().getText();
		
		System.out.println(textOnPopup);

		
		driver.switchTo().alert().dismiss();// to click on cancel button over the popup
		
		
	}

}
