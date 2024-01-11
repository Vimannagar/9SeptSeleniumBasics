package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pompage.LoginPage;
import pompage.RegisterUser;

public class BaseTest {
	
	LoginPage loginpage;
	RegisterUser register;
	
	static WebDriver driver;
	@BeforeSuite
	public void initBrowser()
	{
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	@BeforeClass
	public void createObject()
	{
		 loginpage = new LoginPage(driver);
		 
		 register = new RegisterUser(driver);
				 
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
