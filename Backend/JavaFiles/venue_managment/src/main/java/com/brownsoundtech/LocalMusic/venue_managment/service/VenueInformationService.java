 package com.brownsoundtech.LocalMusic.venue_managment.service;

import com.brownsoundtech.LocalMusic.venue_managment.model.LocalVenue;
import com.brownsoundtech.LocalMusic.venue_managment.model.VenueInformation;

public class VenueInformationService {
	
	
	public VenueInformationService(){
		
	}
	
	public VenueInformationService(LocalVenue venue, VenueInformation venueInformation){
		
		venue.getVenueInformation().setPhoneNumberDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getPhoneNumberDetail()));
		venue.getVenueInformation().setOpenHoursDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getOpenHoursDetail()));
		venue.getVenueInformation().setAcceptedPaymentDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getAcceptedPaymentDetail()));
		venue.getVenueInformation().setWillCallDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getWillCallDetail()));
		
		
		venue.getVenueInformation().setParkingDetail(informationValidation(venue.getVenue().getParkingDetail()));
		
		venue.getVenueInformation().setAccessibleSeatingDetail(informationValidation(venue.getVenue().getAccessibleSeatingDetail()));
		
		venue.getVenueInformation().setGeneralRule(informationValidation(venue.getVenue().getGeneralInfo().getGeneralRule()));
		venue.getVenueInformation().setChildRule(informationValidation(venue.getVenue().getGeneralInfo().getChildRule()));
		
	}

	private String informationValidation(String info) {
		
		if(isNullInformation(info))
			return nullInformation();
		else
			return info;
	}

	private String nullInformation() {
		
		return "Please contact the venue for more information.";
	}

	public boolean isNullInformation(String nullInformation) {
		
		return (nullInformation == null) ? true:false;
	}
	
	

}
