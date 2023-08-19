package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class stepdefinition {
	
	

	@Given("User is on Landing Page")
	public void user_is_on_landing_page() {
	  System.out.println("user is on landing page");
	    
	}
	@When("User Login into application with username and password")
	public void user_login_into_application_with_username_and_password() {
	    System.out.println("enter userid");
	   
	}
	@Then("Home Page is Populated")
	public void home_page_is_populated() {

System.out.println("home page");
	    
	}
	@Then("All the Cards are displayed")
	public void all_the_cards_are_displayed() {
	   System.out.println("card displayed");
	}



}
