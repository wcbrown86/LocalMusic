package com.brownsoundtech.localmusic.venuemanagment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brownsoundtech.localmusic.venuemanagment.controller.LocalVenueController;
import com.brownsoundtech.localmusic.venuemanagment.model.LocalVenue;
import com.brownsoundtech.localmusic.venuemanagment.view.LocalVenueView;

@SpringBootApplication
public class VenueManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueManagmentApplication.class, args);
		
		LocalVenue validVenue = new LocalVenue();
		LocalVenueView validVenueView = new LocalVenueView();
		LocalVenueController validVenueController = new LocalVenueController(validVenue, validVenueView);
		
		validVenueController.setLocalVenueAddress1("2505 Washington Rd.");
		validVenueController.setLocalVenueAddress2("Test Address 2 Imformation");
		validVenueController.setLocalVenueCity("Augusta");
		validVenueController.setLocalVenueState("Georgia");
		validVenueController.setLocalVenueZip("30904");
		
		validVenueController.setLocalVenueLatitude("33.5062091");
		validVenueController.setLocalVenueLongitude("-82.0187325");
		
		validVenueController.setLocalVenueName("Augusta National Golf Course");
		validVenueController.setLocalVenueWebAddress("https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329");
		
		validVenueController.updateLocalVenueView();
		
	}

}
