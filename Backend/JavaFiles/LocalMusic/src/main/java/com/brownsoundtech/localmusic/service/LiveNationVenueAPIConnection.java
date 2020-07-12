
package com.brownsoundtech.localmusic.service;



/**
 * @author brown
 *
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import com.brownsoundtech.localmusic.domain.LiveNationVenue;
import com.fasterxml.jackson.core.type.TypeReference;


public class LiveNationVenueAPIConnection {
	
	private ObjectMapper mapper;
	private TypeReference<List<LiveNationVenue>> typeReference;
	private String url;
	
	
	
	
	
	
	public void buildRequestString(String request) {
		
		String discovery = "https://app.ticketmaster.com/discovery/v2/venues.json?";
		String apiKey = "";
		
		url = discovery + request + apiKey;
		
	}
	
	

}
