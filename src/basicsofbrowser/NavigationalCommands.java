package basicsofbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();// maximize the browser
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().back();// browser back button will get execute
		
		Thread.sleep(2000);
		
		driver.navigate().forward();// browser forward button will get execute
		
		driver.navigate().refresh();// browser refresh button will execute
		
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
