
package com.brownsoundtech.localmusic.venuemanagment.test.model;

import org.junit.jupiter.api.AfterEach;
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
	
	String notValidString = "No Imformation Provided";
	
	
	@BeforeEach
	void setUpValidVenueInformation() {
		
		validVenue = new LocalVenue();
		
		validVenue.setAddress1("2505 Washington Rd.");
		validVenue.setAddress2("Test Address 2 Imformation");
		validVenue.setCity("Augusta");
		validVenue.setState("Georgia");
		validVenue.setZip("30904");
		
		validVenue.setLatitude("33.5062091");
		validVenue.setLongitude("-82.0187325");
		
		validVenue.setName("Augusta National Golf Course");
		validVenue.setWebAddress("https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329");
		
		
	}
	
	@BeforeEach
	void setUpEmptyVenueInformation() {
		
		emptyVenue = new LocalVenue();
		
		emptyVenue.setAddress1(" ");
		emptyVenue.setAddress2(" ");
		emptyVenue.setCity(" ");
		emptyVenue.setState(" ");
		emptyVenue.setZip(" ");
		
		emptyVenue.setLatitude(" ");
		emptyVenue.setLongitude(" ");
		
		emptyVenue.setName(" ");
		emptyVenue.setWebAddress(" ");
		
		
	}
	
	@BeforeEach
	void SetUpnullVenueInformation(){
		
		nullVenue = new LocalVenue();
		
		nullVenue.setAddress1(null);
		nullVenue.setAddress2(null);
		nullVenue.setCity(null);
		nullVenue.setState(null);
		nullVenue.setZip(null);
		
		nullVenue.setLatitude(null);
		nullVenue.setLongitude(null);
		
		nullVenue.setName(null);
		nullVenue.setWebAddress(null);
		
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
	
	@Test
	void testValidatedStringValidString() {
		
		assertEquals("Test Test", validVenue.validatedString("Test Test"));
		
	}
	
	@Test
	void testValidatedStringNullString() {
		
		assertEquals(notValidString, nullVenue.validatedString(null));
		
	}
	
	@Test
	void testValidatedStringEmptyString() {
		
		assertEquals(notValidString, emptyVenue.validatedString(""));
		assertEquals(notValidString, emptyVenue.validatedString(" "));
		
	}
	
	@Test 
	void testGetNameValidInformation() {
		
		assertEquals("Augusta National Golf Course", validVenue.getName());
		
	}
	
	@Test
	void testGetNameNullInformation() {
		
		assertEquals(notValidString, nullVenue.getName());
		
	}
	
	@Test
	void testGetNameEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getName());
		
	}
	
	@Test 
	void testGetAddress1ValidInformation() {
		
		assertEquals("2505 Washington Rd.", validVenue.getAddress1());
		
	}
	
	@Test
	void testGetAddress1NullInformation() {
		
		assertEquals(notValidString, nullVenue.getAddress1());
		
	}
	
	@Test
	void testGetAddress1EmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getAddress1());
		
	}
	
	@Test 
	void testGetAddress2ValidInformation() {
		
		assertEquals("Test Address 2 Imformation", validVenue.getAddress2());
		
	}
	
	@Test
	void testGetAddress2NullInformation() {
		
		assertEquals(notValidString, nullVenue.getAddress2());
		
	}
	
	@Test
	void testGetAddress2EmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getAddress2());
		
	}
	
	@Test 
	void testGetCityValidInformation() {
		
		assertEquals("Augusta", validVenue.getCity());
		
	}
	
	@Test
	void testGetCityNullInformation() {
		
		assertEquals(notValidString, nullVenue.getCity());
		
	}
	
	@Test
	void testGetCityEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getCity());
		
	}
	
	@Test 
	void testGetStateValidInformation() {
		
		assertEquals("Georgia", validVenue.getState());
		
	}
	
	@Test
	void testGetStateNullInformation() {
		
		assertEquals(notValidString, nullVenue.getState());
		
	}
	
	@Test
	void testGetStateEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getState());
		
	}
	
	@Test 
	void testGetZipValidInformation() {
		
		assertEquals("30904", validVenue.getZip());
		
	}
	
	@Test
	void testGetZipNullInformation() {
		
		assertEquals(notValidString, nullVenue.getZip());
		
	}
	
	@Test
	void testGetZipEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getZip());
		
	}
	
	@Test 
	void testGetLongitudeValidInformation() {
		
		assertEquals("-82.0187325", validVenue.getLongitude());
		
	}
	
	@Test
	void testGetLongitudeNullInformation() {
		
		assertEquals(notValidString, nullVenue.getLongitude());
		
	}
	
	@Test
	void testGetLongitudeEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getLongitude());
		
	}
	
	@Test 
	void testGetLatitudeValidInformation() {
		
		assertEquals("33.5062091", validVenue.getLatitude());
		
	}
	
	@Test
	void testGetLatitudeNullInformation() {
		
		assertEquals(notValidString, nullVenue.getLatitude());
		
	}
	
	@Test
	void testGetLatitudeEmptyInformation() {
		
		assertEquals(notValidString, emptyVenue.getLatitude());
		
	}
	
	@Test 
	void testGetWebAddressValidInformation() {
		
		assertEquals("https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329", validVenue.getWebAddress());
		
	}
	
	@Test
	void testGetWebAddressNullInformation() {
		
		assertEquals(notValidURL, nullVenue.getWebAddress());
		
	}
	
	@Test
	void testGetWebAddressEmptyInformation() {
		
		assertEquals(notValidURL, emptyVenue.getWebAddress());
		
	}
	
	@AfterEach
	void clearMemory() {
		
		validVenue = null;
		nullVenue = null;
		emptyVenue = null;
		
		System.gc();
		
	}

}
