package stepDefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	
	@Given("Open Browser")
	public void open_browser() {
		BaseMethods.openBrowser();
	}
	
	@Given("Launch Application")
	public void launch_application() {
	    BaseMethods.launchApp();
	}
	
	@When("User enters username and password and click on Login Button")
	public void user_enters_username_and_password_and_click_on_login_button() {
	   BaseMethods.login();
	}
	
	@When("User enters {String} and {String} and click on Login Button")
	public void loginWithParam(String uname, String pass) throws InterruptedException {
	   BaseMethods.login(uname, pass);
	}
	
	@When("Click on Logout Button then validate the Logout")
	public void Logout() {
	   BaseMethods.logout();
	   Assert.assertTrue(BaseMethods.driver.findElement(By.id("btnsubmit")).isEnabled());
	}
	
	@Then("Validate the HomePage")
	public void validate_the_home_page() {
	   
	}


}
