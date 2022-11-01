package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Test3 {
	
	String name1, name2;
	Boolean isTrue;
	
	@Given("user reads name1 and name2 values")
	public void user_reads_name1_and_name2_values() {
	  name1 = "Raju";
	  name2 = "Raju";
	}
	@When("compare name1 and name2")
	public void compare_name1_and_name2() {
	   Assert.assertEquals(name1, name2);
	}
	@Then("display the comparision results")
	public void display_the_comparision_results() {
	 
	}

}
