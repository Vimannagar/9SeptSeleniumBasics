package pompage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterUser2 extends LoginTest{
	
	
	@Test
	public void enterLastName()
	{
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Morningbatch");
	}

}
