package basicsofbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BestWayToLaunchBrowser {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();// browser will launch
		
		RemoteWebDriver driver2 = new ChromeDriver();// browser will launch
		
		WebDriver driver3 = new ChromeDriver();// browser will launch
		
		
		WebDriver driver4 = new FirefoxDriver();//browser will launch
		
	String browsername = "Chrome";
	WebDriver driver5 ;
	if(browsername.equals("Chrome"))
	{
		driver5 = new ChromeDriver();
	}
	
	else
	{
		driver5 = new FirefoxDriver();
	}
		
		
		
	}
}
