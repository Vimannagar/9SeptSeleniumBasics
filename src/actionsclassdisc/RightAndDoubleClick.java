package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClick {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		driver.get("https://www.facebook.com/signup");
//		
//		Actions act = new Actions(driver);
//		
//		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
//		
//		act.contextClick(firstname).perform();
		
		
//	Performing double click operation	
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement doubleClickElement = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(doubleClickElement).perform();
		
		
	}

}
