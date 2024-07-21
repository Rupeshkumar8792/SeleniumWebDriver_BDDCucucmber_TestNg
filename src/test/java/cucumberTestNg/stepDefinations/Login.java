package cucumberTestNg.stepDefinations;

import cucumberTestNg.base.BaseClass;
import cucumberTestNg.page.LoginPage;
import cucumberTestNg.utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass
{
	LoginPage gLoginPage = new LoginPage(BaseClass.webDriver.get());
	
	@Given("user launch the Application")
	public void user_launch_the_application() 
	{
	   openApplication(Util.readProperties("url"));
	}

	@When("user enter email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String userName, String passWord)
	{
		gLoginPage.enterUserName(userName);
		gLoginPage.enterPassword(passWord);
	}

	@When("user click on Login")
	public void user_click_on_login() 
	{
		gLoginPage.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string)
	{
	   
	}

	@When("user click on logout button")
	public void user_click_on_logout_button()
	{
	   
	}
}
