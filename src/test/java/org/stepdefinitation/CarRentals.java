package org.stepdefinitation;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.pojoclass.CarRental;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarRentals extends BaseClass {
	CarRental c;
	
	@Given("The user have to click carrentals button")
	public void the_user_have_to_click_carrentals_button() {
		chromeLounch();
		   implicitwait();
		   urlLounch("https://www.booking.com/index.en-gb.html?label=gen173nr-1DCAEoggI46AdIM1gEaGyIAQGYA"
		   		+ "Qm4ARfIAQzYAQPoAQGIAgGoAgO4ApCRqpMGwAIB0gIkZGRmMDAxOWEtYjQ2NC00OWMzLW"
		   		+ "FhNzAtZDM5MjUzMjQ2NDhl2AIE4AIB&sid=26897597b7d0d2739f26ac9fa13bf6f7&keep_landing=1&sb_price_type=total&");
		
		c = new CarRental();
		click(c.getClkCarRental());
		
	}

	@When("The user has to click return to different location")
	public void the_user_has_to_click_return_to_different_location() {
	    click(c.getDifferentLocation());
	}

	@When("The user should be fill {string} and {string}")
	public void the_user_should_be_fill_and(String pickup, String dropoff) {
	   sendkeys(c.getPickUpLocation(), pickup);
	   sendkeys(c.getDropOff(), dropoff);
	   
	}

	@When("The user should be provide start to end")
	public void the_user_should_be_provide_start_to_end() throws InterruptedException {
		
	    click(c.getClkDate());
	    thread();
	    click(c.getInDate());
	    thread();
	    click(c.getOutDate());
	}

	@Then("The user have to click search button")
	public void the_user_have_to_click_search_button() {
//Assert.assertTrue(false);
click(c.getSearchCarTental());
	}



}
