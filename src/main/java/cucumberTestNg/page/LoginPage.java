package cucumberTestNg.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumberTestNg.base.BaseClass;

public class LoginPage extends BaseClass
{
	//declaration stage
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement username;
	
	@FindBy(xpath = "")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement btnLogin;
	
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(BaseClass.webDriver.get(), this);
	}
	
	public void enterUserName(String userName) 
	{
		username.sendKeys(userName);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
}
