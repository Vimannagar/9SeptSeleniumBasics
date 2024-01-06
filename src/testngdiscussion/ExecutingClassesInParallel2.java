package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutingClassesInParallel2 {
//	
//	@Test
//	public void testCase4()
//	{
//		System.out.println("Testcase 4");
//	}
//	
//	@Test
//	public void testCase5()
//	{
//		System.out.println("Testcase 5");
//	}
	
	
	@Test
	public void launchChrome()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
}
