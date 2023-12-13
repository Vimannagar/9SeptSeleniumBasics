package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/slider/");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);// to switch inside the iframe
		
		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(slider).moveByOffset(100, 0).release(slider).build().perform();
		
		driver.switchTo().parentFrame();//To switch outside the Iframe
		
		driver.findElement(By.xpath("//ul//*[text()='Download']")).click();
	
	}
	

}
