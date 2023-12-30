package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethodKeyword {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
		
		throw new NullPointerException("Failing login test case");
		
	}

	@Test(priority = 2, dependsOnMethods = {"login"})
	public void home()
	{
		System.out.println("home page validation");
	}
	
	@Test(priority = 3, dependsOnMethods = {"login", "home"})
	public void profile()
	{
		System.out.println("Checking the profile");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout from the application");
	}

}
