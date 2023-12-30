package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethod2 {
	
	@Test
	public void logout()
	{
		System.out.println("Logout from application");
	}
	
	@Test(dependsOnMethods = {"testngdiscussion.DependsOnMethodKeyword.profile"})
	public void validateTitleOfPage()
	{
		System.out.println("fetching the title of page");
	}

}
