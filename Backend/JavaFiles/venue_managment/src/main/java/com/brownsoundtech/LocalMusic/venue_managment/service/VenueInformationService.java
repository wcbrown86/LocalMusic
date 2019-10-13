 package com.brownsoundtech.LocalMusic.venue_managment.service;

import com.brownsoundtech.LocalMusic.venue_managment.model.LocalVenue;
import com.brownsoundtech.LocalMusic.venue_managment.model.VenueInformation;

public class VenueInformationService {
	
	private LocalVenue venue;
	private VenueInformation venueInformation;
	
	public VenueInformationService(){
		this.venue = null;
		this.venueInformation = null;
	}
	
	public VenueInformationService(LocalVenue venue, VenueInformation venueInformation){
		
		this.venue = venue;
		this.venueInformation = venueInformation;
		
		setPhoneNumberInformation();
		
	}

	private void setPhoneNumberInformation() {
		
		if(isNullInformation(venueInformation.getPhoneNumberDetail()))
				venueInformation.setPhoneNumberDetail(nullInformation());
		else
			venueInformation.setPhoneNumberDetail(venue.getVenue().getBoxOfficeInfo().getPhoneNumberDetail());
		
	}

	private String nullInformation() {
		// TODO Auto-generated method stub
		return "n/a";
	}

	public boolean isNullInformation(String nullInformation) {
		
		return (nullInformation == null) ? true:false;
	}
	
	

}
