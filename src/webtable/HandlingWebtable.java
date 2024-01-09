package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingWebtable {
	
	
	@Test
	public void printElementOfWebTable()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> numberOfrows = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr"));
		
		int totalnumberofrows = numberOfrows.size();
		
		System.out.println(totalnumberofrows);
		
	List<WebElement> allValues = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
		
	int i = 1;
	for(WebElement value :allValues)
	{
		String textValue = value.getText();
		
		System.out.print(textValue+" ");
		
		i++;
		
		if(i==5)
		{
			System.out.println();
			i =1;
		}	
	}
	
	
	
	}

}
