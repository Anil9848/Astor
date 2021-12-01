package bg;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidSteps {
	
	@Before
	public void beforeTest ()
	{
		System.out.println("Beforetest");
	}
	
	@After
	public void afterTest ()
	{
		System.out.println("Aftertest");
	}
	
	@Given("Open Browser")
	public void open_browser() {
		System.out.println("Open Browser");
	}
	
	@And("enter Url")
	public void enter_url() {
		System.out.println("enter Url");
	}
	
	@When("user give valid input")
	public void user_give_valid_input() {
		System.out.println("user give valid input");
	}
	
	@Then("Field should accept")
	public void field_should_accept() {
		System.out.println("Field should accept");
	}
	

}
