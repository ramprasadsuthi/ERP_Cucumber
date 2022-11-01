package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2 {
	
	int a,b,result;
	
	@Given("user reads a and b values")
	public void user_reads_a_and_b_values() {
       a = 100;
       b = 150;
	}
	
	//Added code from Deepthi
	
	//Added code from Hari
	
	@When("user computes a+b")
	public void user_computes_a_b() {
	   result = a+b;
	}
	
	@When("user computes a * b")
	public void user_computes_ab() {
	    result = a*b;
	}
	
	@When("user computes a - b")
	public void user_substracts_ab() {
	    result = a-b;
	}
	
	@Then("display the results")
	public void display_the_results() {
	   System.out.println("The result is : " + result);
	}


}
