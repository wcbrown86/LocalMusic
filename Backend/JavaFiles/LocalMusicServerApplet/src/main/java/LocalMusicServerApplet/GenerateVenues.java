
package LocalMusicServerApplet;

import java.io.IOException;
import java.util.ArrayList;
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
 *
 * @author 		William Brown
 * @copyright 	Apr 19, 2019
 * @version		0.0.1
 * 
 * TODO
 *
 */


public class GenerateVenues {
	
	static final String LIVENATIONAPIKEY = "huk5WDVW6kgR9bt0WVXGGHExyyAF5UlX";
	
	public ArrayList<LocalVenue> gatherLiveNationVenues(String countryCode){
		
		ArrayList<LocalVenue> venueArrayList = new ArrayList<LocalVenue>();
		
		DiscoveryApi apiConnection = new DiscoveryApi(LIVENATIONAPIKEY);
		
		try {
			PagedResponse<Venues> venues = apiConnection.searchVenues(new SearchVenuesOperation().countryCode(countryCode));
			List<Venue> venueList = venues.getContent().getVenues();
			
			for(Venue venue: venueList) {
				
				List<Image> images = venue.getImages();
				ArrayList<String> urlList = new ArrayList<String>();
				
				for(Image image: images) {
					urlList.add(image.getUrl());
				}
				
				
				
				LocalVenue temp = new LocalVenue(venue.getName(),
												 venue.getAddress().getLine1() + " " + venue.getAddress().getLine2(),
												 venue.getCity().getName(),
												 venue.getPostalCode(),
												 venue.getCountry().getCountryCode(),
												 venue.getUrl(),
												 venue.getGeneralInfo().getGeneralRule(),
												 urlList,
												 venue.getId(),
												 "LiveNation");
				
				venueArrayList.add(temp);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		if(venueArrayList.isEmpty())
			return null;
		else
			return venueArrayList;
		
		
	}

}
