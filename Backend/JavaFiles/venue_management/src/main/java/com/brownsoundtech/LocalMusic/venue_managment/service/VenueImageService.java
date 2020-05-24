/**
 * 
 */
package com.brownsoundtech.LocalMusic.venue_managment.service;

import org.apache.commons.validator.routines.UrlValidator;

import com.ticketmaster.discovery.model.Image;

/**
 * @author brown
 *
 */
public class VenueImageService {
	
	public VenueImageService(Image image) {
		
	}
	
	public boolean isNull(Object object) {
		
		if(object == null)
			return true;
		else
			return false;
	}
	
	public boolean isURL(String url) {
		
		UrlValidator urlValid = new UrlValidator();
		
		return urlValid.isValid(url);
	}

}
