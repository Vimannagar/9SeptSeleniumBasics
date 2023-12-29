package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	@Test
	public void loginToApp()
	{
		System.out.println("Login to application");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	
	
	@Test
	public void getTitle()
	{
		System.out.println("validating login page title");
	}

}
