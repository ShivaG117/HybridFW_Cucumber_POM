package stepDefinations;

import java.util.List;
import java.util.Map;

import com.Factory.DriverFactory;
import com.Pages.HomePage;
import com.Pages.NewCustomerPage;
import com.Utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterNewcustomerSteps {
	
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	NewCustomerPage newCustomerPage = new NewCustomerPage(DriverFactory.getDriver());
	ExcelReader excelReader = new ExcelReader();
	
	@Given("when user is on New Customer Page")
	public void when_user_is_on_new_customer_page() {
		homePage.clickNewCustomer();
		String registrationPageTitle = newCustomerPage.getPageTitle();
		System.out.println("New Customer page title: "+registrationPageTitle);
		
	}

	@When("user enters the data in the form from xlsx file")
	public void user_enters_the_data_in_the_form_from_xlsx_file() {
		String path = "src/test/resources/testData/guru99_new customer.xlsx";
		String sheet = "New customer";
		
		List<Map<String, String>> allData = excelReader.getAllData(path, sheet);
		for(Map<String, String> row:allData) {
			newCustomerPage.formFilling(
					row.get("customer"), 
					row.get("gen"), 
					row.get("DOB"), 
					row.get("Add"),
					row.get("city"), 
					row.get("state"), 
					row.get("pincode"),
					row.get("mobile"), 
					row.get("email")
					);
		}
	}

	@When("user click on regester button")
	public void user_click_on_regester_button() {
//		newCustomerPage.clickSubmitButton();
	}

	@Then("success message should be displayed as {string}")
	public void success_message_should_be_displayed_as(String string) {
		
	}

}
