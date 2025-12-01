package stepDefinations;

import org.junit.Assert;

import com.Factory.DriverFactory;
import com.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps {
	String actualHomePageTitle;
	//	ConfigReader configReader;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user is on HomePage")
	public void user_is_on_home_page() {
		if(homePage.isHomePageLoaded()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
//		DriverFactory.getDriver().get("https://demo.guru99.com/V1/index.php");
	}

	@When("user gets the HomePage title")
	public void user_gets_the_home_page_title() {
		actualHomePageTitle = homePage.getHomePageTitle();
	}

	@Then("HomePage title should be {string}")
	public void home_page_title_should_be(String expectedTitle) {
		Assert.assertEquals(expectedTitle, actualHomePageTitle);
	}


}
