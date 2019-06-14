package kamaliii;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class jooo {
	@Given("I want to enter username {string}")
	public void i_want_to_enter_username(String string) {
	    System.out.println(string);
	}

	@And("I want to enter password {string}")
	public void i_want_to_enter_password(String string) {
		 System.out.println(string);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    
	}

	@Then("the home page is displayed")
	public void the_home_page_is_displayed() {
	    
	}
}
