package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingTestTagInParallel2 {
	WebDriver driver;
	@Test(priority = 1)
	public void launchChrome()
	{
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.in/");
	}
	
	@Test(priority = 2)
	public void getTitleOfPage()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
