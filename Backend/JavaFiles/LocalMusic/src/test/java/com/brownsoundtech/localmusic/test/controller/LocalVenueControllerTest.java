/**
 * 
 */
package com.brownsoundtech.localmusic.test.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.brownsoundtech.localmusic.controller.LocalVenueController;
import com.brownsoundtech.localmusic.model.LocalVenue;
import com.brownsoundtech.localmusic.view.LocalVenueView;

/**
 * @author brown
 *
 */
class LocalVenueControllerTest {
	
	LocalVenue validVenue, emptyVenue, nullVenue;
	LocalVenueController validVenueController, emptyVenueController, nullVenueController;
	LocalVenueView validVenueView, emptyVenueView, nullVenueView;
	
	String notValidURL = "No Valid URL Was Provided.";
	
	String notValidString = "No Imformation Provided";
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		validVenue = new LocalVenue();
		validVenueView = new LocalVenueView();
		validVenueController = new LocalVenueController(validVenue, validVenueView);
		
		validVenueController.setLocalVenueAddress1("2505 Washington Rd.");
		validVenueController.setLocalVenueAddress2("Test Address 2 Imformation");
		validVenueController.setLocalVenueCity("Augusta");
		validVenueController.setLocalVenueState("Georgia");
		validVenueController.setLocalVenueZip("30904");
		
		validVenueController.setLocalVenueLatitude("33.5062091");
		validVenueController.setLocalVenueLongitude("-82.0187325");
		
		validVenueController.setLocalVenueName("Augusta National Golf Course");
		validVenueController.setLocalVenueWebAddress("https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329");
		
		emptyVenue = new LocalVenue();
		emptyVenueView = new LocalVenueView();
		emptyVenueController = new LocalVenueController(emptyVenue, emptyVenueView);
		
		emptyVenueController.setLocalVenueAddress1("");
		emptyVenueController.setLocalVenueAddress2("");
		emptyVenueController.setLocalVenueCity("");
		emptyVenueController.setLocalVenueState("");
		emptyVenueController.setLocalVenueZip("");
		
		emptyVenueController.setLocalVenueLatitude("");
		emptyVenueController.setLocalVenueLongitude("");
		
		emptyVenueController.setLocalVenueName("");
		emptyVenueController.setLocalVenueWebAddress("");
		
		nullVenue = new LocalVenue();
		nullVenueView = new LocalVenueView();
		nullVenueController = new LocalVenueController(nullVenue, nullVenueView);
		
		nullVenueController.setLocalVenueAddress1(null);
		nullVenueController.setLocalVenueAddress2(null);
		nullVenueController.setLocalVenueCity(null);
		nullVenueController.setLocalVenueState(null);
		nullVenueController.setLocalVenueZip(null);
		
		nullVenueController.setLocalVenueLatitude(null);
		nullVenueController.setLocalVenueLongitude(null);
		
		nullVenueController.setLocalVenueName(null);
		nullVenueController.setLocalVenueWebAddress(null);
		
	
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
		validVenue = null;
		validVenueController = null;
		
		emptyVenue = null;
		emptyVenueController = null;
		
		nullVenue = null;
		nullVenueController = null;
		
		System.gc();
		
	}

	@Test
	void testUpdatLocalVenueViewValidInformation() {
		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s, %s"
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"2505 Washington Rd."
				,"Test Address 2 Imformation"
				,"Augusta"
				,"Georgia"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueController.updateLocalVenueView());
		
		
	}
	
	@Test
	void testUpdatLocalVenueViewEmptyInformation() {
		
		String expectedOutPut = String.format("Venue Information Not Provided.");
		
		assertEquals(expectedOutPut, emptyVenueController.updateLocalVenueView());
		
		
	}
	
	@Test
	void testUpdatLocalVenueViewNullInformation() {
		
		String expectedOutPut = String.format("Venue Information Not Provided.");
		
		assertEquals(expectedOutPut, nullVenueController.updateLocalVenueView());
		
		
	}
	
	@Test 
	void testGetNameValidInformationController() {
		
		assertEquals("Augusta National Golf Course", validVenueController.getLocalVenueName());
		
	}
	
	@Test
	void testGetNameNullInformationController() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueName());
		
	}
	
	@Test
	void testGetNameEmptyInformationController() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueName());
		
	}
	
	@Test 
	void testGetAddress1ValidInformation() {
		
		assertEquals("2505 Washington Rd.", validVenueController.getLocalVenueAddress1());
		
	}
	
	@Test
	void testGetAddress1NullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueAddress1());
		
	}
	
	@Test
	void testGetAddress1EmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueAddress1());
		
	}
	
	@Test 
	void testGetAddress2ValidInformation() {
		
		assertEquals("Test Address 2 Imformation", validVenueController.getLocalVenueAddress2());
		
	}
	
	@Test
	void testGetAddress2NullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueAddress2());
		
	}
	
	@Test
	void testGetAddress2EmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueAddress2());
		
	}
	
	@Test 
	void testGetCityValidInformation() {
		
		assertEquals("Augusta", validVenueController.getLocalVenueCity());
		
	}
	
	@Test
	void testGetCityNullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueCity());
		
	}
	
	@Test
	void testGetCityEmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueCity());
		
	}
	
	@Test 
	void testGetStateValidInformation() {
		
		assertEquals("Georgia", validVenueController.getLocalVenueState());
		
	}
	
	@Test
	void testGetStateNullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueState());
		
	}
	
	@Test
	void testGetStateEmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueState());
		
	}
	
	@Test 
	void testGetZipValidInformation() {
		
		assertEquals("30904", validVenueController.getLocalVenueZip());
		
	}
	
	@Test
	void testGetZipNullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueZip());
		
	}
	
	@Test
	void testGetZipEmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueZip());
		
	}
	
	@Test 
	void testGetLongitudeValidInformation() {
		
		assertEquals("-82.0187325", validVenueController.getLocalVenueLongitude());
		
	}
	
	@Test
	void testGetLongitudeNullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueLongitude());
		
	}
	
	@Test
	void testGetLongitudeEmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueLongitude());
		
	}
	
	@Test 
	void testGetLatitudeValidInformation() {
		
		assertEquals("33.5062091", validVenueController.getLocalVenueLatitude());
		
	}
	
	@Test
	void testGetLatitudeNullInformation() {
		
		assertEquals(notValidString, nullVenueController.getLocalVenueLatitude());
		
	}
	
	@Test
	void testGetLatitudeEmptyInformation() {
		
		assertEquals(notValidString, emptyVenueController.getLocalVenueLatitude());
		
	}
	
	@Test 
	void testGetWebAddressValidInformation() {
		
		assertEquals("https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329", validVenueController.getLocalVenueWebAddress());
		
	}
	
	@Test
	void testGetWebAddressNullInformation() {
		
		assertEquals(notValidURL, nullVenueController.getLocalVenueWebAddress());
		
	}
	
	@Test
	void testGetWebAddressEmptyInformation() {
		
		assertEquals(notValidURL, emptyVenueController.getLocalVenueWebAddress());
		
	}
	
	
}
