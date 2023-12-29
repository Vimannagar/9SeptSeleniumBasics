package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("launching the browser");
	}
	
	
	@Test
	public void login() 
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void profile() 
	{
		System.out.println("Profile testcase");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Closing the browser");
	}

}
