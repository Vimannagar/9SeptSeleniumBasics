package testngdiscussion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertInTestNG {
	
	
	@Test
	public void testCase1()
	{
		String expected = "abc";
		String actual = "abc";
		
//		Applying assertion to compare the actual and expected value
		
		Assert.assertEquals(actual, expected);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String titleOfPage = driver.getTitle();
		
		System.out.println(titleOfPage);
		
		boolean isContains = titleOfPage.contains("Shoppping");
		
		
		Assert.assertEquals(isContains, true);
		
	
		
	}
	
	@Test
	public void testCase2()
	{
		boolean a = true;
		
		Assert.assertTrue(a);
		
	}
	
	@Test
	public void testCase3()
	{
		boolean b = false;
		
		Assert.assertFalse(b);
	}
	
	@Test
	public void testCase4()
	{
		String a = "abc";
		
		String b = "aBc";
		
		System.out.println("Before assertion");
		
		Assert.assertEquals(a, b);
		
		System.out.println("after assertion");
		
		boolean c = true;
		
		boolean d = false;
		
		Assert.assertTrue(d);
		
		System.out.println("After Assert true method");
	}
	

}
