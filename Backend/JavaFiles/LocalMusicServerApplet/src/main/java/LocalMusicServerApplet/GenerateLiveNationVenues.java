
package LocalMusicServerApplet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
 * 			This Class is used to gather updated, or create new information from venues. The information is pulled
 * 			from the used APIs that are provided by the Event companies like LiveNation. 
 *
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
	
	static final String LIVENATIONAPIKEY = "huk5WDVW6kgR9bt0WVXGGHExyyAF5UlX";
	
	
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
	public LinkedList<LocalVenue> gatherVenues(String stateCode){
		
		LinkedList<LocalVenue> fullVenueList = new LinkedList<LocalVenue>();
		
		DiscoveryApi apiConnection = new DiscoveryApi(LIVENATIONAPIKEY);
		
		try {
			PagedResponse<Venues> venues = apiConnection.searchVenues(new SearchVenuesOperation().stateCode(stateCode));
			List<Venue> venueList = venues.getContent().getVenues();
			
			for(Venue venue: venueList) {
				
				LocalVenue temp = createVenueObject(venue);
				fullVenueList.add(temp);
				
			}
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		if(fullVenueList.isEmpty())
			return null;
		else
			return fullVenueList;
		
		
	}


	public LocalVenue createVenueObject(Object object) {
		
		Venue venue = (Venue) object;
		LocalVenue localVenue;
		
		List<Image> images = venue.getImages();
		ArrayList<String> urlList = convertImageToURL(images);
		String generalInformation = parseInformation(venue);
		
		localVenue = new LocalVenue(venue.getName(),
										 venue.getAddress().getLine1() + " " + venue.getAddress().getLine2(),
										 venue.getCity().getName(),
										 venue.getPostalCode(),
										 venue.getCountry().getCountryCode(),
										 venue.getUrl(),
										 urlList,
										 generalInformation,
										 venue.getId(),
										 "LiveNation");
		
		return localVenue;
	}
	
	public ArrayList<String> convertImageToURL(List<Image> images){
		
		ArrayList<String> urlList = new ArrayList<String>(images.size());
		
		for(Image image: images) {
			urlList.add(image.getUrl());
		}
		
		return urlList;
		
	}
	
	public String parseInformation(Venue venue) {
		String information = "";
		
		if(venue.getGeneralInfo().getGeneralRule() != null)
			
			information += "General Rule \n" + 
							venue.getGeneralInfo().getGeneralRule() + 
							"\n";
		
		if(venue.getGeneralInfo().getChildRule() != null)
			
			information += "Child Rule \n" +
						  venue.getGeneralInfo().getChildRule() +
						  "\n";
		
		return information;
	}
}
