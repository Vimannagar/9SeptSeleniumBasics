package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id='disable']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(buttonElement));// this will wait till the element doesnt comes with clickable state
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
//		Assignment: WAP to handle the alert specific condition using explicit wait
		
//		wait.until(ExpectedConditions.alertIsPresent());
	}

}
