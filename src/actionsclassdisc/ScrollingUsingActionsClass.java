package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActionsClass {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Best Sellers in Toys & Games']"));
		
		Actions act = new Actions(driver);
		
		
		act.scrollToElement(element).perform();
		
		
		
	}

}
