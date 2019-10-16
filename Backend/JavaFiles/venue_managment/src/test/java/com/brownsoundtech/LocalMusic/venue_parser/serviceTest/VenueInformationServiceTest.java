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
		nonNullVenue.setBoxOfficeInfo(new BoxOfficeInfo("Test", "Test", "Test", "Test"));
		nonNullVenue.setAccessibleSeatingDetail("Test");
		nonNullVenue.setGeneralInfo(new GeneralInfo("Test", "Test", "Test"));
		nonNullVenue.setParkingDetail("Test");
		
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
		
		assertEquals( "Test", nonNullLocalVenue.getVenueInformation().getPhoneNumberDetail());
	}
	
	@Test
	public void nullOpenHoursShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getOpenHoursDetail() );
		
	}
	
	@Test
	public void shouldOpenHoursNumberTest() {
		
		assertEquals( "Test", nonNullLocalVenue.getVenueInformation().getOpenHoursDetail());
	}

}
