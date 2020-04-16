/**
 * 
 * @author 	William Chad Brown
 * @date 	10/24/2019
 * @version 1.0.0
 * 
 * This class is used to process the information that is stored in the Venue information class. This information is checked to 
 * see if any information was provided, if so that information is stored and if not a generic request to contact the venue for 
 * more information is stored in its place. 
 * 
 */
package com.brownsoundtech.LocalMusic.venue_managment.service;

import com.brownsoundtech.LocalMusic.venue_managment.model.LocalVenue;

public class VenueInformationService {
	
	/**
	 * No argument constructor that is used mostly for testing. 
	 */
	public VenueInformationService(){
		
	}
	
	/**
	 * 
	 * Constructor that is used to check each part of the information provided and then check in the information
	 * and store the relevant information for each field. This constructor is only used for information that is 
	 * received from the live Nation API.
	 * 
	 * @param venue - LocalVenue object which in the object to be manipulated and updated.
	 * 
	 */
	public VenueInformationService(LocalVenue venue){
		
		// Taking Live Nation Box office information and saving into the LocalVenue object.
		venue.getVenueInformation().setPhoneNumberDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getPhoneNumberDetail()));
		venue.getVenueInformation().setOpenHoursDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getOpenHoursDetail()));
		venue.getVenueInformation().setAcceptedPaymentDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getAcceptedPaymentDetail()));
		venue.getVenueInformation().setWillCallDetail(informationValidation(venue.getVenue().getBoxOfficeInfo().getWillCallDetail()));
		
		// taking parking information and saving in the LocalVenue object.
		venue.getVenueInformation().setParkingDetail(informationValidation(venue.getVenue().getParkingDetail()));
		
		//Taking the accessible seating information and saving into the LocalVenue object.
		venue.getVenueInformation().setAccessibleSeatingDetail(informationValidation(venue.getVenue().getAccessibleSeatingDetail()));
		
		//Taking the general rule information and saving into the LocalVenue object.
		venue.getVenueInformation().setGeneralRule(informationValidation(venue.getVenue().getGeneralInfo().getGeneralRule()));
		venue.getVenueInformation().setChildRule(informationValidation(venue.getVenue().getGeneralInfo().getChildRule()));
		
	}

	/**
	 * 
	 * Method that is used to validate the information. First it checks to see if the information is null, if non-null information is 
	 * provided then that information is returned. If null information is present then the nullInformation() metod is called to set the 
	 * generic information to the field. 
	 * 
	 * @param info - String that contains the information to be validated.
	 * @return - a String that will be saved into the field that is being validated.
	 * 
	 */
	private String informationValidation(String info) {
		
		if(isNullInformation(info))
			return nullInformation();
		else
			return info;
	}

	/**
	 * 
	 * Returns a generic String that is stored when no information is provided by the venue. This information asks 
	 * that the user contact the venue for more information. 
	 * 
	 * @return - a String that asks the user to contact the venue for more information. 
	 * 
	 */
	private String nullInformation() {
		
		return "Please contact the venue for more information.";
	}

	/**
	 * This method checks the String object to see if the information is null. Then returns true if the information is null, and false otherwise. 
	 * 
	 * @param nullInformation - String object to check.
	 * @return - Boolean True if the information is null, False otherwise. 
	 */
	public boolean isNullInformation(String nullInformation) {
		
		return (nullInformation == null) ? true:false;
	}
	
	

}
