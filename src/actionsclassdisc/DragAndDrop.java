package actionsclassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");

		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));

		driver.switchTo().frame(iframe);// we are switching into the frame

		WebElement dragElement = driver.findElement(By.xpath("//*[@id='draggable']"));

		WebElement dropElement = driver.findElement(By.xpath("//*[@id='droppable']"));

		Actions act = new Actions(driver);
		

		act.dragAndDrop(dragElement, dropElement).perform();

	}

}
