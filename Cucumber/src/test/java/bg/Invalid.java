package bg;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Invalid {
	
	@When ("user give invalid input")
	
	public void user_give_invalid_input() {
		System.out.println("user give invalid input");
	}
	
	@Then ("Field Should not accept")
	public void field_should_not_accept() {
		System.out.println("Field should not accept");
	}

}
