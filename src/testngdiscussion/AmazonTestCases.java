package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTestCases {
	WebDriver driver;
	@Test(priority = 1)
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		
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
