package com.brownsoundtech.LocalMusic.venue_managment.model;

import java.util.Queue;

public class LocalVenue {
	
	private String name, address, city, postalCode, countryCode, url,
	id, sourceAPI;
	
	private VenueInformation venueInformation;
	private VenueImages venueImages;
	private Queue<VenueEvents> venueEvents;
	
	
	public String getVenueInformation() {
		
		return venueInformation.toString();
		
	}
	
	public String getImages() {
		
		return venueImages.toString();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSourceAPI() {
		return sourceAPI;
	}
	public void setSourceAPI(String sourceAPI) {
		this.sourceAPI = sourceAPI;
	}
	public Queue<VenueEvents> getVenueEvents() {
		return venueEvents;
	}
	public void setVenueEvents(Queue<VenueEvents> venueEvents) {
		this.venueEvents = venueEvents;
	}

}
