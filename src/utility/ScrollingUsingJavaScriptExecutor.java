package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingJavaScriptExecutor {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("window.scrollBy(0, 4000)");// scrolling downward by 4000px
//		
//		
//		js.executeScript("window.scrollBy(0, -2000)");// scrolling upward by 2000px
		
		WebElement elementTillScroll = driver.findElement(By.xpath("//*[text()='Christmas Decor | Amazon Brands & more']"));
		
		js.executeScript("arguments[0].scrollIntoView();",elementTillScroll );
		
		
		
	}

}
