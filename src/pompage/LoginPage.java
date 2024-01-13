package pompage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
//	If we want to locate both the locator over the webpage and then we want to perform the operation then we have to use @FindBys
	@FindBys({
		@FindBy(xpath = "//*[@id='userEmail']"),
		
		@FindBy(xpath="//*[@type='email']")
	})
	WebElement  username;
	
	
	@FindBy(xpath = "//*[@id='userPassword']")
	WebElement password;
	
//	@FindBy(xpath = "//*[@id='login']")
//	WebElement loginButton;
	
//	If we want to locate either of the locator over webpage then we can use @FindAll
@FindAll(
		{
			@FindBy(xpath = "//*[@id='login']"),
			@FindBy(xpath = "//*[@id='login123']")
		}
		)
WebElement loginButton;



	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterCredentials()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		username.sendKeys("yewrieuwyr@gmail.com");
		
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
