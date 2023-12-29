package testngdiscussion;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	

	
	
	@Test
	public void verifyUrl()
	{
		System.out.println("Verification of url");
	}
	
	@Test
	public void validateCarousel()
	{
		System.out.println("Carousel validation");
	}

}
