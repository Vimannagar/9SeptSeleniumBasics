package pompage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement  username;
	
	@FindBy(xpath = "//*[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath = "//*[@id='login']")
	WebElement loginButton;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredentials()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		username.sendKeys("kjfhksdfdks@gmail.com");
		
		password.sendKeys("Test@1234");
	}
	
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	public String getTitleOfPage()
	{
		String titleOfPage = driver.getTitle();
		
		return titleOfPage;
	}
	
	
}
