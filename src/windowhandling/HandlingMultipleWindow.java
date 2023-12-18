package windowhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		String parentWinId = driver.getWindowHandle();// to get the id of window which got opened first i.e parent
														// window id

		System.out.println(parentWinId);

		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();

	}

}
