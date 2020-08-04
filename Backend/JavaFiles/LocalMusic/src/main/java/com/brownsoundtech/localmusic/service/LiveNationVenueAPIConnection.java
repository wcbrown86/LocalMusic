
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

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.List;
import com.brownsoundtech.localmusic.domain.LiveNationVenue;
import com.fasterxml.jackson.core.type.TypeReference;


public class LiveNationVenueAPIConnection {
	
	protected ObjectMapper mapper;
	protected TypeReference<List<LiveNationVenue>> typeReference;
	protected String url;
	protected String apiKey;
	protected String requestedInformation;
		
	/**
	 * 
	 * This method is used to send the request to the API and send the response information to the correct 
	 * class.  
	 * 
	 */
	public LiveNationVenueAPIConnection(String apiKey, String requestedInformation) {

		this.apiKey = apiKey;
		this.requestedInformation = requestedInformation;

		buildRequestString();
		makeGetRequest();

	}

	/**
	 * 
	 * This method is used to take the information that is passed from the main
	 * application and then build the correct URL string to get the information
	 * requested to update the database.
	 * 
	 * @param request - A formated string that will be used as a URL to connect to
	 *                an API
	 * 
	 */
	private void buildRequestString() {

		final String discovery = "https://app.ticketmaster.com/discovery/v2/venues.json?";
		final String key = "&apikey=" + this.apiKey;
		url = discovery + this.requestedInformation + key;
		
	}

	/**
	 * 
	 * This method will create the connection to the API and will POST a GET 
	 * request to bring in the information requested. I will then pass the JSON 
	 * object to be parsed. 
	 * 
	 */
	private void makeGetRequest() {
		
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(url).build();

		try{
			Response response = client.newCall(request).execute();
		}catch(Exception e){
			System.out.println(e.toString());
		}

	}
	
	

}
