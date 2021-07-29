package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions 

{
	@Before("@bvtnew")
	public void openBrowser()
	{
		System.out.println("Opening browser");
	}
	
	@After("@bvtnew")
	public void tearDown()
	{
		System.out.println("closing browser");
	}
	@Given("user navigates to facebook")
	public void user_navigates_to_facebook_com() {
		
		System.out.println(" User navigated to facebook ");
	   
	}

	@When("user entered {string} username")
	public void user_entered_valid_username(String username) 
	
	{
		System.out.println(" User entered "+username+"username");
	   
	}

	@When("user entered {string} password")
	public void user_entered_valid_password(String Password) 
	
	{
		System.out.println(" User entered "+Password+"password");
	}

	

	@When("user click on SignIn button")
	public void user_click_on_sign_in_button() 
	{
		System.out.println("user clicked on signIn button ");
	}
	
	@Then("user {string} successfully LoggedIn")
	public void user_shouldbe_successfully_logged_in(String login) 
	{
		System.out.println(" User"+login+"successfully loogedIn");
	}

	
}
