
package com.brownsoundtech.localmusic.venuemanagment.test.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import com.brownsoundtech.localmusic.venuemanagment.model.LocalVenue;

/**
 * @author brown
 *
 */
class LocalVenueTest {
	LocalVenue validVenue, emptyVenue, nullVenue;
	String notValidURL = "No Valid URL Was Provided.";
	
	
	@BeforeEach
	void setUpValidVenueInformation() {
		
		validVenue = new LocalVenue();
		
	}
	
	@BeforeEach
	void setUpEmptyVenueInformation() {
		
		emptyVenue = new LocalVenue();
		
	}
	
	@BeforeEach
	void SetUpNullVenueInformation(){
		
		nullVenue = new LocalVenue();
		
	}

	@Test
	void testValidateURLAddressValidURL() {
		String url = "https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329";
		assertEquals(url, validVenue.validateURLAddress(url));
	
	}
	
	@Test
	void testValidateURLAddressEmptyURL() {
		
		assertEquals(notValidURL, emptyVenue.validateURLAddress(""));
		
	}
	
	@Test
	void testValidateURLAddressNullURL() {
		
		assertEquals(notValidURL, nullVenue.validateURLAddress(null));
		
	}

}
