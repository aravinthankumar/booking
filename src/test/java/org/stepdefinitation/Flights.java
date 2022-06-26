package org.stepdefinitation;

import org.baseclass.BaseClass;
import org.pojoclass.Flight;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Flights extends BaseClass {
	Flight f;
	
	@Given("The user have to click flights button")
	public void the_user_have_to_click_flights_button() {
		chromeLounch();
		   implicitwait();
		   urlLounch("https://www.booking.com/index.en-gb.html?label=gen173nr-1DCAEoggI46AdIM1gEaGyIAQGYA"
		   		+ "Qm4ARfIAQzYAQPoAQGIAgGoAgO4ApCRqpMGwAIB0gIkZGRmMDAxOWEtYjQ2NC00OWMzLW"
		   		+ "FhNzAtZDM5MjUzMjQ2NDhl2AIE4AIB&sid=26897597b7d0d2739f26ac9fa13bf6f7&keep_landing=1&sb_price_type=total&");
		
	  f = new Flight();
	  click(f.getClickFlights());
	}

	@When("The user has to click one way button")
	public void the_user_has_to_click_one_way_button() {
	    click(f.getOneWay());
	}

	@When("The user should be enter {string} and {string}")
	public void the_user_should_be_enter_and(String from, String to) throws InterruptedException {
		click(f.getClkfrom());
		thread();
		click(f.getClkfromCancel());
		thread();
	   sendkeys(f.getFrom(), from);
	   click(f.getResfrom());
	   
	   click(f.getClkto());
	   thread();
	   sendkeys(f.getTo(), to);
	   
	   click(f.getResTo());
	}

	@When("The user has to click cabin class and increase adult count")
	public void the_user_has_to_click_cabin_class_and_increase_adult_count() {
	    
	    click(f.getClkAdults());
	    click(f.getIncAdults());
	    click(f.getClkDone());
	    
	}

	@When("The user should be provide depart and return")
	public void the_user_should_be_provide_depart_and_return() throws InterruptedException {
		thread();
		click(f.getClkDate());
		thread();
	    click(f.getInDate());
	    click(f.getOutDate());
	}

	@When("The user has to click busness class")
	public void the_user_has_to_click_busness_class() {
		 click(f.getClkclass());
		    click(f.getPremium());
	}

	@Then("The user has to click search button")
	public void the_user_has_to_click_search_button() {
	   click(f.getSearchFlights());
	}
}
