package com.brownsoundtech.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.brownsoundtech.model.LocalVenue;
import com.ticketmaster.api.discovery.DiscoveryApi;
import com.ticketmaster.api.discovery.operation.SearchVenuesOperation;
import com.ticketmaster.api.discovery.response.PagedResponse;
import com.ticketmaster.discovery.model.Image;
import com.ticketmaster.discovery.model.Venue;
import com.ticketmaster.discovery.model.Venues;

/**
 * <h3>
 *		About:
 * </h3>
 * 
 * 			This Class is used to gather updated, or create new information from venues in the Live Nation 
 * 			API system. 
 *
 * @author 		William Brown
 * @copyright 	Apr 19, 2019
 * @version		0.0.1
 * 
 * TODO : 
 * 			1. Currently working on using the Live Nation API to gather all the venue information that 
 * 			   is stored in there API. 
 * 			2. Create a function that will pulled saved venue information from the database and then check
 * 			   for updates.
 * 			3. Add search function for a different Event API. More research is needed for the next API system
 * 			   to use. 
 *
 */


public class GenerateLiveNationVenues implements GenerateVenues {
	
	/**
	 * In this function, the application will take a given Postal Code and will gather all the 
	 * venues in this postal code. Then created a LocalVenue object and add this object to a LinkedList.
	 * This linkedList is returned to the calling method to be stored for later use. This function is meant
	 * to be used to update the list with changes made by the venues. Will be ran monthly as a part of the 
	 * application upkeep.
	 * 
	 * @param countryCode : A String that represents the Postal Code or Zip code that needs to be checked for venues.
	 * @return : A linked list that can be converted to a JSON file for later use, or used to update the SQL server. 
	 */
	public LinkedList<LocalVenue> gatherVenues(String stateCode, String apiKey){
		
		// The List that will hold all the retrieved venues that are converted to the LocalVenue object. 
		LinkedList<LocalVenue> fullVenueList = new LinkedList<LocalVenue>();
		
		// Creates the API connection.
		DiscoveryApi apiConnection = new DiscoveryApi(apiKey);
		
		
		try {
			
			// This variable holds the information sent back from the API connection.  
			PagedResponse<Venues> venues = apiConnection.searchVenues(new SearchVenuesOperation().stateCode(stateCode).pageSize(199));
			int numPages = venues.getPageInfo().getTotalPages();
			int i = 0;
			while( i < numPages) {
				
				if(venues.getContent() != null) {
					// Holds the parsed Venues from the PagedResponse input. 
					List<Venue> venueList = venues.getContent().getVenues();
				
					// Loop that takes each retrieved venue and converts it into a LocalVenue Item. 
					for(Venue venue: venueList) {
					
						LocalVenue temp = createVenueObject(venue);
						fullVenueList.add(temp);
					
					}
					
					venues = apiConnection.nextPage(venues);
					i++;
				}
			}
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		// Checks to see if the list is empty, if it is empty null is returned, other wise the list is returned.
		if(fullVenueList.isEmpty())
			return null;
		else
			return fullVenueList;
		
		
	}

	
	/**
	 * 
	 * The method is implemented from the interface. It takes in an object that is 
	 * casted to a LiveNation Venue object. This object is then parsed to convert 
	 * the information into a LocalVenue object that is then passed back to the calling
	 * method to be used or stored. 
	 * 
	 * @param object : a generic object that can be used to convert to a LocalVenue object.
	 * @return LocalVenue : A object that can be better used by the program and stored. 
	 * 
	 */
	public LocalVenue createVenueObject(Object object) {
		
		// Takes the object that is passed and casts it to a LiveNation Venue object.
		Venue venue = (Venue) object;
		
		// Creates the LocalVenue Object to store the converted information.
		LocalVenue localVenue;
		
		String vName;
		
		if(venue.getName() != null)
			vName = venue.getName();
		else
			vName = "null";
		
		String vAddress;
		
		if(venue.getAddress() != null)
			vAddress = venue.getAddress().getLine1() + " " + venue.getAddress().getLine2();
		else
			vAddress = "null";
		
		String vCity;
		
		if(venue.getCity() != null)
			vCity = venue.getCity().getName();
		else
			vCity = "null";
		
		String vPostalCode;
		
		if(venue.getPostalCode() != null)
			vPostalCode = venue.getPostalCode();
		else
			vPostalCode = "null";
		
		String vCountryCode;
		
		if(venue.getCountry() != null)
			vCountryCode = venue.getCountry().getCountryCode();
		else
			vCountryCode = "null";
		
		String vURL;
		
		if(venue.getUrl() != null)
			vURL = venue.getUrl();
		else
			vURL = "null";
		
		// A list that holds the URLs of the image object that is passed from the API, once it is converted.
		List<Image> images = venue.getImages();
		
		ArrayList<String> urlList = convertImageToURL(images);
		
		// Holds the parsed information that is passed from the API about the venue.
		String generalInformation = parseInformation(venue);
		
		// Takes that information from the API and collects the information needed to convert to a LocalVenue object.
		localVenue = new LocalVenue(vName, vAddress, vCity, vPostalCode, vCountryCode, vURL, urlList,
									generalInformation, venue.getId(), "LiveNation");
		
		return localVenue;
	}

	/**
	 * 
	 * This method takes the LiveNation Image list, and pulls the URLs for the images
	 * then stores the URLs into an ArrayList of Strings. 
	 * 
	 * @param images : A List of LiveNation Images to be parsed for usable information.
	 * @return : Returns an ArrayList of Strings containing the URLs for the images.
	 * 
	 */
	public ArrayList<String> convertImageToURL(List<Image> images){
		
		ArrayList<String> urlList = new ArrayList<String>();
		
		if(images != null) {
		
			for(Image image: images) {
				urlList.add(image.getUrl());
			}
		}
		
		return urlList;
		
	}
	
	/**
	 * 
	 * The General information is parsed for the String data in the object
	 * 
	 * @param venue : LiveNation venue object to be parsed for the general information.
	 * @return : Returns a String that will contain information provided by the venue. 
	 * 
	 */
	public String parseInformation(Venue venue) {
		String information = "";
		
		if(venue.getGeneralInfo() != null) {
		
			if(venue.getGeneralInfo().getGeneralRule() != null)
				
				information += "General Rule \n" + 
								venue.getGeneralInfo().getGeneralRule() + 
								"\n";
			
			if(venue.getGeneralInfo().getChildRule() != null)
				
				information += "Child Rule \n" +
							  venue.getGeneralInfo().getChildRule() +
							  "\n";
			
			return information;
		} else {
			
			return "No General Information.";
		}
	}
}
