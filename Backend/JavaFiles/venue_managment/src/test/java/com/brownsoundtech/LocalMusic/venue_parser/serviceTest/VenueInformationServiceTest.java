package com.brownsoundtech.LocalMusic.venue_parser.serviceTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.brownsoundtech.LocalMusic.venue_managment.model.LocalVenue;
import com.brownsoundtech.LocalMusic.venue_managment.service.VenueInformationService;
import com.ticketmaster.discovery.model.Venue;
import com.ticketmaster.discovery.model.Venue.BoxOfficeInfo;
import com.ticketmaster.discovery.model.Venue.GeneralInfo;

public class VenueInformationServiceTest {
	
	private LocalVenue nullLocalVenue;
	
	private LocalVenue nonNullLocalVenue;
	
	@BeforeEach
	public void SetUpVenueInformation() {
		
		
		Venue nullVenue = new Venue();
		nullVenue.setBoxOfficeInfo(new BoxOfficeInfo(null, null, null, null));
		nullVenue.setAccessibleSeatingDetail(null);
		nullVenue.setGeneralInfo(new GeneralInfo(null,null, null));
		nullVenue.setParkingDetail(null);
		
		nullLocalVenue = new LocalVenue(nullVenue);
		
		Venue nonNullVenue = new Venue();
		nonNullVenue.setBoxOfficeInfo(new BoxOfficeInfo("Test Accepted Payments", "Test Phone Number", "Test Will Call Information", "Test Open Hours"));
		nonNullVenue.setAccessibleSeatingDetail("Test Accessible Seating Detail");
		nonNullVenue.setGeneralInfo(new GeneralInfo("Test Child Rule", "Test General Rule", "Test throwaway information"));
		nonNullVenue.setParkingDetail("Test Parking Details");
		
		nonNullLocalVenue = new LocalVenue(nonNullVenue);
		
	}
	
	
	@Test
	public void nullInformationShoudBeTrueTest() {
		String nullInformation = null;
		VenueInformationService venueInformationService = new VenueInformationService();
		
		assertTrue(venueInformationService.isNullInformation(nullInformation));
	}
	
	@Test
	public void nullInformationShouldBeFalseTest() {
		
		String nonNullInformation = "Test";
		VenueInformationService venueInformationService = new VenueInformationService();
		
		assertFalse(venueInformationService.isNullInformation(nonNullInformation));
		
	}
	
	@Test
	public void nullPhoneNumberShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getPhoneNumberDetail() );
		
	}
	
	@Test
	public void shouldReturnPhoneNumberTest() {
		
		assertEquals( "Test Phone Number", nonNullLocalVenue.getVenueInformation().getPhoneNumberDetail());
	}
	
	@Test
	public void nullOpenHoursShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getOpenHoursDetail() );
		
	}
	
	@Test
	public void shouldOpenHoursNumberTest() {
		
		assertEquals( "Test Open Hours", nonNullLocalVenue.getVenueInformation().getOpenHoursDetail());
	}
	
	@Test
	public void nullAcceptedPaymentshouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getAcceptedPaymentDetail());
		
	}
	
	@Test
	public void shouldShowAcceptedPaymentTest() {
		
		assertEquals( "Test Accepted Payments", nonNullLocalVenue.getVenueInformation().getAcceptedPaymentDetail());
	}
	
	@Test
	public void nullWillCallshouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getWillCallDetail());
		
	}
	
	@Test
	public void shouldShowWillCallTest() {
		
		assertEquals( "Test Will Call Information", nonNullLocalVenue.getVenueInformation().getWillCallDetail());
	}
	
	@Test
	public void nullParkingDetailShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getParkingDetail());
		
	}
	
	@Test
	public void shouldShowParkingDetailsTest() {
		
		assertEquals( "Test Parking Details", nonNullLocalVenue.getVenueInformation().getParkingDetail());
	}
	
	@Test
	public void nullAccessibleSeatingShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getAccessibleSeatingDetail());
		
	}
	
	@Test
	public void shouldShowAccessibleSeatingDetailsTest() {
		
		assertEquals( "Test Accessible Seating Detail", nonNullLocalVenue.getVenueInformation().getAccessibleSeatingDetail());
	}

}
