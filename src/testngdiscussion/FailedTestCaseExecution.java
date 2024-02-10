package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FailedTestCaseExecution {
	
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().refresh();
	}
	
	
	@Test(priority = 1)
	public void validateCartICon()
	{
 boolean isGettingDisplayed = driver.findElement(By.xpath("//*[@id='nav-cart123']")).isDisplayed();
		
		Assert.assertEquals(isGettingDisplayed, true);
		
	}

	
	@Test(priority = 2)
	public void searchProduct()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	
	}
	
	@Test(priority = 3)
	public void clickOnSamsungPhone()
	{
		driver.findElement(By.xpath("//*[contains(text(),'Galaxy M34 5G')] ")).click();
	}

}
