
package com.brownsoundtech.localmusic.service;

/**
 * @author William Chad Brown
 * @version 0.0.1
 * 
 * This class is used to connect to the Live Nation Discovery API. It is intended to 
 * connect to the venue API and update or collect new information on venues in there system
 *
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import java.util.List;
import com.brownsoundtech.localmusic.domain.LiveNationVenue;
import com.fasterxml.jackson.core.type.TypeReference;

@Data
public class LiveNationVenueAPIConnection {
	
	private ObjectMapper mapper;
	private TypeReference<List<LiveNationVenue>> typeReference;
	private String url;
		
	/**
	 * 
	 * This method is used to send the request to the API and send the response information to the correct 
	 * class.  
	 * 
	 */
	public LiveNationVenueAPIConnection(String apiKey, String requestedInformation) {
		
		System.out.println(apiKey);
		buildRequestString(requestedInformation, apiKey);
		System.out.println(url);
	}
	
	/**
	 * 
	 * This method is used to take the information that is passed from the main application 
	 * and then build the correct URL string to get the information requested to update the 
	 * database.
	 * 
	 * @param request - A formated string that will be used as a URL to connect to an API
	 * 
	 */
	private void buildRequestString(String request, String key) {
		
		String discovery = "https://app.ticketmaster.com/discovery/v2/venues.json?";
		String apiKey = "&apikey=" + key;
		url = discovery + request + apiKey;
		
	}
	
	

}
