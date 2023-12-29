package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
	}

	@Test(priority = 2)
	public void home()
	{
		System.out.println("home page validation");
	}
	
	@Test(priority = 3)
	public void profile()
	{
		System.out.println("Checking the profile");
	}
	
	@Test(priority = 1, enabled = false, invocationCount = 5)
	public void logout()
	{
		System.out.println("Logout from the application");
	}
}
