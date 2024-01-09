package pompage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterUser extends LoginTest {
	
	
	@Test(priority = 3)
	public void fillRegistrationForm()
	{
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sept batch");
	}

}
