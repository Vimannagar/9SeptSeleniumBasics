package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPRTCDropdown {
	
	
	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("shi");
		
		// to print the text available on webpage
		String text = driver.findElement(By.xpath("//*[text()='Search for bus tickets']")).getText();
		
		
		System.out.println(text);
		
//		use of findElements method
		
		
		List<WebElement> allCities = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
	
		
		for(WebElement city :allCities)
		{
			String cityname = city.getText();
			
			System.out.println(cityname);
		}
	
		
//	WAP to click on RISHIKESH option from the dropdown
		
	
	
	}
	

}
