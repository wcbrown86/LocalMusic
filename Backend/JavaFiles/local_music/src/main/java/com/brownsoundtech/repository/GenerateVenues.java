package com.brownsoundtech.repository;

import java.util.LinkedList;

import com.brownsoundtech.model.LocalVenue;



/**
 * <h3>
 *		About:
 * </h3>
 *
 *
 * @author 		William Brown
 * @copyright 	Apr 20, 2019
 * @version		0.0.1
 * 
 * TODO
 *
 */
public interface GenerateVenues {
	
	
	public LinkedList<LocalVenue> gatherVenues(String countryCode, String apiKey);
	
	public LocalVenue createVenueObject( Object object);

}

