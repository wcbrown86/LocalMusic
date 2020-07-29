package com.brownsoundtech.localmusic.view;

import com.brownsoundtech.localmusic.controller.LocalVenueController;

/**
 * @author William Chad Brown
 * @version 0.0.1
 * 
 * Not sure this class will be needed in the end of the project. This program will mainly
 * be used to update the SQL database. The idea for the possible use of a view would be to show 
 * database updates as they happen. So more of a information console that can be accessed from
 * the web. Putting Development of this class and other view classes on hold for now. 
 *
 */
public class LocalVenueView {
	
	
	/**
	 * 
	 * This method will return a formatted string object containing the venue information.
	 * 
	 * @param venueController
	 * @return A formated string containing the information that is contained in the 
	 * 		Venue Controller. 
	 */
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
		
		
		
		System.out.println(informationToOutPut + "\n\n");
		
		return informationToOutPut;
		
	}
	/**	
	 * 
	 * This is a method used buy the printVenueInformation to validate the information that is 
	 * passed so that the string can be formatted in the correct way. 
	 * 
	 * @param informationToValidate
	 * @return True if the information passed is not filler information.
	 * 		   False if the information passed is filler information. 
	 * 
	 */
	private boolean isInformationVaild(String informationToValidate) {
		
		if(informationToValidate.equals("No Imformation Provided") || informationToValidate.equals("No Valid URL Was Provided."))
			return false;
		else
			return true;
		
	}

}
 