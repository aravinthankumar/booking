package org.stepdefinitation;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.pojoclass.Stay;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stays extends BaseClass{
	 Stay s;
	@Given("The user should be booking.com page")
	public void the_user_should_be_booking_com_page() {
		
	   chromeLounch();
	   implicitwait();
	   urlLounch("https://www.booking.com/index.en-gb.html?label=gen173nr-1DCAEoggI46AdIM1gEaGyIAQGYA"
	   		+ "Qm4ARfIAQzYAQPoAQGIAgGoAgO4ApCRqpMGwAIB0gIkZGRmMDAxOWEtYjQ2NC00OWMzLW"
	   		+ "FhNzAtZDM5MjUzMjQ2NDhl2AIE4AIB&sid=26897597b7d0d2739f26ac9fa13bf6f7&keep_landing=1&sb_price_type=total&");
	}

	@When("The user has to enter where are you going")
	public void the_user_has_to_enter_where_are_you_going() throws IOException {
		
		s = new Stay();

		sendkeys(s.getWRUG(), getData("Book1", "Sheet1", 1, 0));
		
	}

	@When("The user should be provide checkin and checkout")
	public void the_user_should_be_provide_checkin_and_checkout() {
		click(s.getClickInAndOutDate());
	   click(s.getIndate());
	   click(s.getOutDate());
	}

	@When("The user has to click rooms and increase adult count")
	public void the_user_has_to_click_rooms_and_increase_adult_count() {
	   click(s.getRoomAndAdults());
	   click(s.getIncRoom());
	   click(s.getIncAdults());
		
	}

	@When("The user has to click  iam travelling for work")
	public void the_user_has_to_click_iam_travelling_for_work() {
	    
		click(s.getImtravelling());
	}

	@Then("The user has to click search")
	public void the_user_has_to_click_search() {
	    click(s.getSeacrhStays());
	}



}
