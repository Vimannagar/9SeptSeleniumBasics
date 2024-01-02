package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {
	
	@Parameters("server")
	@Test(priority = 1)
	public void getBrowsername(String nameOfBrowser)
	{
		System.out.println("Testcase to read data from xml file");
		
		System.out.println("Received value from XML is "+nameOfBrowser);
				
	}
	
	@Parameters({"server", "browser"})
	@Test(priority = 2)
	public void getServerAndBrowser(String serverValue, String browsername)
	{
		System.out.println("Testcase to read data from xml file");
		
		System.out.println("Server value received from XML is "+serverValue);
		
		if(browsername.equals("Chrome"))
		{
			WebDriver driver = new ChromeDriver();
			
		}
		else
		{
			WebDriver driver = new FirefoxDriver();	
		}
		
		
	}
	
	@Parameters({"projectname", "browser"})
	@Test(priority = 3)
	public void getProjectAndBrowserName(String projectName, String browserName)
	{
		System.out.println("Project name value is "+projectName);
		System.out.println("Browser name value is "+browserName);
	}

}
