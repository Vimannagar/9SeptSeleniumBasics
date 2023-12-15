package popuphandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		
		driver.findElement(By.xpath("//*[@name='toPlaceName']")).click();
		
		String textOnPopup = driver.switchTo().alert().getText();
		
		System.out.println(textOnPopup);

		
		driver.switchTo().alert().accept();// to click on OK button over the popup
		
		
	}

}
