package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDisc {
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		
		WebElement dailyNeeds = driver.findElement(By.xpath("//*[@alt='Daily essentials']"));
		
//	applying fluent wait
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.pollingEvery(Duration.ofSeconds(1))
										.withTimeout(Duration.ofSeconds(60))
										.ignoring(NoSuchElementException.class);
				
		
		wait.until(ExpectedConditions.visibilityOf(dailyNeeds));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", dailyNeeds);
	}

}
