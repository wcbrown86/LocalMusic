package com.brownsoundtech.localmusic.venuemanagment.view;

import com.brownsoundtech.localmusic.venuemanagment.controller.LocalVenueController;

/**
 * @author brown
 *
 */
public class LocalVenueView {
	
	public void printVenueInformation(LocalVenueController venueController) {
		
		if(!venueController.getLocalVenueAddress2().equals("No Imformation Provided")) {
			
			System.out.printf("Venue Information: \n"
					+ "%s \n"
					+ "%s \n"
					+ "%s \n"
					+ "%s \n"
					+ "%s %s, %s"
					,venueController.getLocalVenueName()
					,venueController.getLocalVenueWebAddress()
					,venueController.getLocalVenueAddress1()
					,venueController.getLocalVenueAddress2()
					,venueController.getLocalVenueCity()
					,venueController.getLocalVenueState()
					,venueController.getLocalVenueZip());
		} else {
			
			System.out.printf("Venue Information: \n"
					+ "%s \n"
					+ "%s \n"
					+ "%s \n"
					+ "%s %s, %s"
					,venueController.getLocalVenueName()
					,venueController.getLocalVenueWebAddress()
					,venueController.getLocalVenueAddress1()
					,venueController.getLocalVenueCity()
					,venueController.getLocalVenueState()
					,venueController.getLocalVenueZip());
		}
		
	}

}
 