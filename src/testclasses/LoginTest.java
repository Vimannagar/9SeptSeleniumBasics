package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority = 4)
	public void loginToApp()
	{	
		loginpage.enterCredentials();
		
		loginpage.clickOnLogin();
	}
	
	@Test(priority = 3)
	
	public void validateTitle()
	{
		String title= loginpage.getTitleOfPage();
		
		Assert.assertEquals(title, "Let's Shop");


	}

}
