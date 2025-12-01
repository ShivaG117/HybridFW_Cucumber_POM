package stepDefinations;

import org.junit.Assert;

import com.Factory.DriverFactory;
import com.Pages.LoginPage;

import io.cucumber.java.en.*;


public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("when user is on login page")
	public void when_user_is_on_login_page() {
		String loginPageTitle = loginPage.getLoginPageTitle();
		System.out.println("LoginPage Titile is: "+loginPageTitle);
	}

	@When("user enters the userId {string}")
	public void user_enters_the_user_id(String userName) {
		loginPage.enterUsername(userName);

	}

	@When("user enters the password {string}")
	public void user_enters_the_password(String password) {
		loginPage.enterPassword(password);

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expManagerPageTitle) {
		String managerTitlePage = loginPage.getLoginPageTitle();
		Assert.assertEquals(expManagerPageTitle, managerTitlePage);

	}
	
	@Then("new alert triggered and message should be {string}")
	public void new_alert_triggered_and_message_should_be(String expAlertMessage) {
		String alertMessage = loginPage.alertTriggered();
		Assert.assertEquals(expAlertMessage, alertMessage);
	}


}
