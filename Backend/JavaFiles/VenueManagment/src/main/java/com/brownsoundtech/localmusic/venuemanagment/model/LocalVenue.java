package com.brownsoundtech.localmusic.venuemanagment.model;

import org.apache.commons.validator.routines.UrlValidator;




/**
 * @author brown
 *
 */
public class LocalVenue {
	
	private String name, address1, address2, city, state, zip, longitude, latitude, webAddress;
	
	
	
	public String validatedString (String stringToCheck) {
		
		if(stringToCheck == null || stringToCheck.trim().isEmpty())
			return "No Imformation Provided";
		else 
			return stringToCheck;
		
	}
	
	public String validateURLAddress ( String urlAddress) {
		
		String[] schemes = {"http","https"};
		UrlValidator urlValidator = new UrlValidator(schemes);
		
		if(urlValidator.isValid(urlAddress)) {
			return urlAddress;
		} else
			return "No Valid URL Was Provided.";
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		
		this.name = validatedString(name);
	}
	/**
	 * @return the address1
	 */
	public String getAddress1() {
		return address1;
	}
	/**
	 * @param address1 the address1 to set
	 */
	public void setAddress1(String address1) {
		this.address1 = validatedString(address1);
	}
	/**
	 * @return the address2
	 */
	public String getAddress2() {
		return address2;
	}
	/**
	 * @param address2 the address2 to set
	 */
	public void setAddress2(String address2) {
		this.address2 = validatedString(address2);
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = validatedString(city);
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = validatedString(state);
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = validatedString(zip);
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = validatedString(longitude);
	}
	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = validatedString(latitude);
	}
	/**
	 * @return the webAddress
	 */
	public String getWebAddress() {
		return  webAddress;
	}
	/**
	 * @param webAddress the webAddress to set
	 */
	public void setWebAddress(String webAddress) {
		this.webAddress =  validateURLAddress(webAddress);
	}
	

}
