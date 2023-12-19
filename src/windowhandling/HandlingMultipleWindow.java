package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		String parentWinId = driver.getWindowHandle();// to get the id of window which got opened first i.e parent
														// window id

		System.out.println(parentWinId);

		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();

		
		
		
		Set<String> allWinId = driver.getWindowHandles();
		
	int totalNumberOfWindows = allWinId.size();
		
		
		String [] strArray = new String [totalNumberOfWindows];
	
		int i =0;
		for(String winId:allWinId)
		{
			strArray [i] = winId;
			i++;
		}
		
		for(String id :strArray)
		{
			System.out.println(id);
		}
		
		
		driver.switchTo().window(strArray[2]);
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Testing typing");
		
		driver.close();// This is to close the current window on which selenium is having focus but not all windows
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
