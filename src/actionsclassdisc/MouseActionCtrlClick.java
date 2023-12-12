package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionCtrlClick {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement alreadySignin = driver.findElement(By.xpath("//*[text()='Already have an account?']"));
		
		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL)
		.click(alreadySignin)
		.keyUp(Keys.CONTROL)
		.build().perform();
	}

}
