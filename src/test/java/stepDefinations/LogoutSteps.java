package stepDefinations;

import org.junit.Assert;

import com.Pages.LogoutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogoutSteps {
	LogoutPage logoutPage = new LogoutPage();
	
	@Given("user clicks on logout link")
	public void user_clicks_on_logout_link() {
		logoutPage.Logout();

	}

	@Then("popup should be displayed with the text {string}")
	public void popup_should_be_displayed_with_the_text(String expAlertMessage) {
		String actAlertMessage = logoutPage.alertTriggered();
		Assert.assertEquals(expAlertMessage, actAlertMessage);
	}

}
