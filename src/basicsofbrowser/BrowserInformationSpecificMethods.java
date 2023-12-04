package basicsofbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInformationSpecificMethods {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String titleOfPage = driver.getTitle();// this method returns the tile of page
		
		System.out.println(titleOfPage);//print the title - Sign up for Facebook | Facebook
		
		
		String urlOfPage = driver.getCurrentUrl();// this method returns the current url of page
		
		System.out.println(urlOfPage);//https://www.facebook.com/signup
		
		
		
		

	}

}
