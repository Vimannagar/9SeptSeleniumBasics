package testclasses;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
	
	@Test(priority = 1)
	public void registerUser()
	{
		register.clickOnRegister();
		
		register.enteringDetails();
	}

	
	@Test(priority = 2)
	public void navToLoginPage()
	{
		register.clickOnLoginButton();
	}
}
