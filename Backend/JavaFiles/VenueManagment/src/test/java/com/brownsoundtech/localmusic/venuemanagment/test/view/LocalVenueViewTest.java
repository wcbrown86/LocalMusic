/**
 * 
 */
package com.brownsoundtech.localmusic.venuemanagment.test.view;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.brownsoundtech.localmusic.venuemanagment.controller.LocalVenueController;
import com.brownsoundtech.localmusic.venuemanagment.model.LocalVenue;
import com.brownsoundtech.localmusic.venuemanagment.view.LocalVenueView;

/**
 * @author brown
 *
 */
class LocalVenueViewTest {

	private LocalVenue validVenue;
	private LocalVenueView validVenueView;
	private LocalVenueController validVenueController;

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
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		
		validVenue = null;
		validVenueView = null;
		validVenueController = null;
		
		System.gc();
		
	}

	@Test
	void testPrintVenueInformationAllInformationProvided() {
		
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
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoName() {
		
		validVenueController.setLocalVenueAddress1("");
		validVenueController.setLocalVenueAddress2("");
		validVenueController.setLocalVenueCity("");
		validVenueController.setLocalVenueState("");
		validVenueController.setLocalVenueZip("");
		
		validVenueController.setLocalVenueLatitude("");
		validVenueController.setLocalVenueLongitude("");
		
		validVenueController.setLocalVenueName("");
		validVenueController.setLocalVenueWebAddress("");
		
		String expectedOutPut = String.format("Venue Information Not Provided.");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoWebAddress() {
		
		validVenueController.setLocalVenueWebAddress("");
		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s, %s"
				,"Augusta National Golf Course"
				,"2505 Washington Rd."
				,"Test Address 2 Imformation"
				,"Augusta"
				,"Georgia"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoAddress1() {
		
		validVenueController.setLocalVenueAddress1("");
		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s, %s"
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"Test Address 2 Imformation"
				,"Augusta"
				,"Georgia"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoAddress2() {
		

		validVenueController.setLocalVenueAddress2("");
		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s, %s"
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"2505 Washington Rd."
				,"Augusta"
				,"Georgia"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}

	@Test
	void testPrintVenueInformationNoCity() {

		validVenueController.setLocalVenueCity("");

		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s, %s"
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"2505 Washington Rd."
				,"Test Address 2 Imformation"
				,"Georgia"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoState() {

		validVenueController.setLocalVenueState("");

		
		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s"
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"2505 Washington Rd."
				,"Test Address 2 Imformation"
				,"Augusta"
				,"30904");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}
	
	@Test
	void testPrintVenueInformationNoZip() {
		
		validVenueController.setLocalVenueZip("");

		String expectedOutPut = String.format("Venue Information: \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s \n"
				+ "%s %s, "
				,"Augusta National Golf Course"
				,"https://www.ticketmaster.com/madison-square-garden-tickets-new-york/venue/483329"
				,"2505 Washington Rd."
				,"Test Address 2 Imformation"
				,"Augusta"
				,"Georgia");
		
		assertEquals(expectedOutPut, validVenueView.printVenueInformation(validVenueController));
		
	}


}
