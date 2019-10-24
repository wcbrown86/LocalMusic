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
	
	@Test
	public void nullGeneralRuleShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getGeneralRule());
		
	}
	
	@Test
	public void shouldGeneralRuleTest() {
		
		assertEquals( "Test General Rule", nonNullLocalVenue.getVenueInformation().getGeneralRule());
	}
	
	@Test
	public void nullChildRuleShouldReturnNATest() {
		
		assertEquals( "n/a", nullLocalVenue.getVenueInformation().getChildRule());
		
	}
	
	@Test
	public void shouldChildRuleDetailsTest() {
		
		assertEquals( "Test Child Rule", nonNullLocalVenue.getVenueInformation().getChildRule());
	}
	
	@Test
	public void toStringTestShouldFormatteAllInformationTest() {
		
		String phoneNumber = String.format("Box Office Phone Number: \n\t%s", nonNullLocalVenue.getVenueInformation().getPhoneNumberDetail());
		String openHours = String.format("Hours Of Opperation: \n\t%s", nonNullLocalVenue.getVenueInformation().getOpenHoursDetail());
		String willCall = String.format("Will Call Information: \n\t%s", nonNullLocalVenue.getVenueInformation().getWillCallDetail());
		String paymentInformation = String.format("Accepted Payment Information: \n\t%s", nonNullLocalVenue.getVenueInformation().getAcceptedPaymentDetail());
		String parkingDetail = String.format("Parking Information: \n\t%s", nonNullLocalVenue.getVenueInformation().getParkingDetail());
		String generalRule = String.format("General Information: \n\t%s", nonNullLocalVenue.getVenueInformation().getGeneralRule());
		String childRule = String.format("Child Rule Information \n\t%s", nonNullLocalVenue.getVenueInformation().getChildRule());
		String accessibleSeating = String.format("Accessible Seating Information \n\t%s", nonNullLocalVenue.getVenueInformation().getAccessibleSeatingDetail());
		
		String fullOutPut = String.format("%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s", phoneNumber, openHours, willCall, paymentInformation, parkingDetail, generalRule, childRule, accessibleSeating);
	
		assertEquals(fullOutPut, nonNullLocalVenue.getVenueInformation().toString());
		
	}
	
	@Test
	public void toStringTestShouldFormatteAllNullInformationTest() {
		
		String phoneNumber = String.format("Box Office Phone Number: \n\t%s", nullLocalVenue.getVenueInformation().getPhoneNumberDetail());
		String openHours = String.format("Hours Of Opperation: \n\t%s", nullLocalVenue.getVenueInformation().getOpenHoursDetail());
		String willCall = String.format("Will Call Information: \n\t%s", nullLocalVenue.getVenueInformation().getWillCallDetail());
		String paymentInformation = String.format("Accepted Payment Information: \n\t%s", nullLocalVenue.getVenueInformation().getAcceptedPaymentDetail());
		String parkingDetail = String.format("Parking Information: \n\t%s", nullLocalVenue.getVenueInformation().getParkingDetail());
		String generalRule = String.format("General Information: \n\t%s", nullLocalVenue.getVenueInformation().getGeneralRule());
		String childRule = String.format("Child Rule Information \n\t%s", nullLocalVenue.getVenueInformation().getChildRule());
		String accessibleSeating = String.format("Accessible Seating Information \n\t%s", nullLocalVenue.getVenueInformation().getAccessibleSeatingDetail());
		
		String fullOutPut = String.format("%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s", phoneNumber, openHours, willCall, paymentInformation, parkingDetail, generalRule, childRule, accessibleSeating);
	
		assertEquals(fullOutPut, nullLocalVenue.getVenueInformation().toString());
		
	}
	

}
