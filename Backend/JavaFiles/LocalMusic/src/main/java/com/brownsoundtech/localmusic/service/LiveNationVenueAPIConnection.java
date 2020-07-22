
package com.brownsoundtech.localmusic.service;



/**
 * @author brown
 *
 */

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;


import com.brownsoundtech.localmusic.domain.LiveNationVenue;
import com.fasterxml.jackson.core.type.TypeReference;


public class LiveNationVenueAPIConnection {
	
	private ObjectMapper mapper;
	private TypeReference<List<LiveNationVenue>> typeReference;
	private String url;
	
	
	@Value("${LiveNationKey}")
	private String key;
	
	
	
	public LiveNationVenueAPIConnection() {
		
		System.out.println(key);
	}
	
	
	public void buildRequestString(String request) {
		
		String discovery = "https://app.ticketmaster.com/discovery/v2/venues.json?";
		String apiKey = "&apikey=" + key;
		
		url = discovery + request + apiKey;
		
	}
	
	

}
