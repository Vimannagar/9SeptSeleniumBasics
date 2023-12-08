package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnRishikeshOnHPRTC {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
				
				driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("shi");
				
		
//				use of findElements method
				
				Thread.sleep(2000);
				
				
				List<WebElement> allCities = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
			
				
				for(WebElement city :allCities)
				{
					String cityname = city.getText();
					
					if(cityname.equals("RISHIKESH"))
					{
						city.click();
						
						driver.switchTo().alert().accept();// this will handle the pop up
						
						break;
					}
					
					System.out.println(cityname);
				}
			
				
//			WAP to click on RISHIKESH option from the dropdown
				
			
			
			}
			

}
