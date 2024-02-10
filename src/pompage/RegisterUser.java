package pompage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser {
	WebDriver driver;
	By firstname  = By.xpath("//*[@id='firstName']");
	
	@FindBy(xpath = "//*[text()='Register']")
	WebElement registerbutton;
	
//	@FindBy(xpath = "//*[@id='firstName']")
//	WebElement firstname;
	
	@FindBy(xpath = "//*[@id='lastName']")
	WebElement lastname;
		
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement useremail;
	
	@FindBy(xpath = "//*[@id='userMobile']")
	WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath = "//form//select")
	WebElement occupationDropdown;
	
	@FindBy(xpath = "//*[@value='Male']")
	WebElement radioButton;
	
	@FindBy(xpath = "//*[@id='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	WebElement checkbox;
	
	@FindBy(xpath = "//*[@id='login']")
	WebElement registerfinalButton;
	
	
	@FindBy(xpath = "//*[text()='Login']")
	WebElement loginButton;
	
	public RegisterUser(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRegister()
	{
		registerbutton.click();
	}
	
	public void enteringDetails()
	{
		WebElement name = driver.findElement(firstname);
		
		name.sendKeys("dgfjd");
//		firstname.sendKeys("SeptUser");
		lastname.sendKeys("Morningbatch");
		useremail.sendKeys("hfjkdshksd@gmail.com");
		phonenumber.sendKeys("9988776655");
	
		Select selOccupation = new Select(occupationDropdown);
		
		selOccupation.selectByVisibleText("Engineer");
		
		radioButton.click();
		
		password.sendKeys("Test@1234");
		
		confirmPassword.sendKeys("Test@1234");
		
		checkbox.click();
		
		registerfinalButton.click();
		
	}
	
	public void clickOnLoginButton()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		loginButton.click();
	}
	
	
	
	
	
	
}
