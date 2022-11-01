package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add1 {
	
	int a,b,sum;
	
	@Given("get {int} and {int} from user")
	public void get_a_and_b_from_user(int num1, int num2) {
	   a = num1;
	   b = num2;
	}
	@When("add a, b")
	public void add_a_b() {
       sum = a+b;
   	}
	@Then("display the sum")
	public void display_the_sum() {
       System.out.println("The sum of a+b is : " + sum);
	}


}
