package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@Test(priority = 1)
	public void loginToApp()
	{
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/client/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("gouravjawale0708@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='userPassword']")).sendKeys("Test@1234");
		
//		driver.findElement(By.xpath("//*[@id='login']")).click();
	}
	
	@Test(priority = 2)
	public void registerUser()
	{
		driver.findElement(By.xpath("//*[text()='Register']")).click();
	}

}
