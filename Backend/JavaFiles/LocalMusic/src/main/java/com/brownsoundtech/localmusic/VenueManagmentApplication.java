package com.brownsoundtech.localmusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.brownsoundtech.localmusic.controller.LocalVenueController;
import com.brownsoundtech.localmusic.model.LocalVenue;
import com.brownsoundtech.localmusic.view.LocalVenueView;

@SpringBootApplication
public class VenueManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueManagmentApplication.class, args);
		
		LocalVenue validVenue = new LocalVenue();
		LocalVenueView validVenueView = new LocalVenueView();
		LocalVenueController validVenueController = new LocalVenueController(validVenue, validVenueView);
	
		
	}
	
	public static void updateLiveNationVenueInformation(String arguments) {
		
		
		
	}
	

}
