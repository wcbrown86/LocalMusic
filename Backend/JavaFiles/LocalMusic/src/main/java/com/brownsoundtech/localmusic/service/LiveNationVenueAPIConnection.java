
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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.brownsoundtech.localmusic.domain.LiveNationVenue;
import com.fasterxml.jackson.core.type.TypeReference;


public class LiveNationVenueAPIConnection {
	
	private ObjectMapper mapper;
	private TypeReference<List<LiveNationVenue>> typeReference;
	private String url;

	
	//This value is pulled from a vault that contains all the keys needed to connect to the systems.
	private String LiveNationAPIKey;
	
	
	/**
	 * 
	 * This method is used to send the request to the API and send the response information to the correct 
	 * class.  
	 * 
	 * TODO: The current setup just prints out the information that is passed. Used for testing at the 
	 * moment. Still need to verify that the key is pulled from the vault then that the correct 
	 * URL string is created. Then set up the API connection and then send the response to be parsed. 
	 * 	 
	 */
	public LiveNationVenueAPIConnection() {
		
		System.out.println(LiveNationAPIKey);
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
	private void buildRequestString(String request) {
		
		String discovery = "https://app.ticketmaster.com/discovery/v2/venues.json?";
		//String apiKey = "&apikey=" + key;
		
		//url = discovery + request + apiKey;
		
	}
	
	

}
