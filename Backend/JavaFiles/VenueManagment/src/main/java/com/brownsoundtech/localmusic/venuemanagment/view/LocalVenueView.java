package com.brownsoundtech.localmusic.venuemanagment.view;

import com.brownsoundtech.localmusic.venuemanagment.controller.LocalVenueController;

/**
 * @author brown
 *
 */
public class LocalVenueView {
	
	public String printVenueInformation(LocalVenueController venueController) {
		
		String informationToOutPut = "Venue Information: \n";
		
		if(isInformationVaild(venueController.getLocalVenueName()))
			informationToOutPut += venueController.getLocalVenueName() + " \n";
		else {
			informationToOutPut = "Venue Information Not Provided.";
			
			System.out.println(informationToOutPut);
			return informationToOutPut;
		}
		
		if(isInformationVaild(venueController.getLocalVenueWebAddress()))
			informationToOutPut += venueController.getLocalVenueWebAddress() + " \n";
		
		if(isInformationVaild(venueController.getLocalVenueAddress1()))
			informationToOutPut += venueController.getLocalVenueAddress1() + " \n";
		
		if(isInformationVaild(venueController.getLocalVenueAddress2()))
			informationToOutPut += venueController.getLocalVenueAddress2() + " \n";
		
		if(isInformationVaild(venueController.getLocalVenueCity()))
			informationToOutPut += venueController.getLocalVenueCity() + " ";
		
		if(isInformationVaild(venueController.getLocalVenueState()))
			informationToOutPut += venueController.getLocalVenueState() + ", ";
		
		if(isInformationVaild(venueController.getLocalVenueZip()))
			informationToOutPut += venueController.getLocalVenueZip();
		
		
		
		System.out.println(informationToOutPut);
		
		return informationToOutPut;
		
	}
	
	public boolean isInformationVaild(String informationToValidate) {
		
		if(informationToValidate.equals("No Imformation Provided") || informationToValidate.equals("No Valid URL Was Provided."))
			return false;
		else
			return true;
		
	}

}
 