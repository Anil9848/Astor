package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GoogleDD {
	@Given("^User opens(.*) test$")
	public void user_opens_chrome_test(String br) {
		System.out.println(br);
	}
	
	@Then("^verify page$")
	public void verify_page() {
		System.out.println("page verified");
	}
}
