package com.brownsoundtech.LocalMusic.venue_parser.serviceTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.brownsoundtech.LocalMusic.venue_managment.service.VenueImageService;
import com.ticketmaster.discovery.model.Image;

public class VenueimageServiceTest {
	
	Image testNonNullImage;
	VenueImageService nonNullImageService;
	
	Image testNullImage;
	VenueImageService nullImageService;
	
	@BeforeEach
	public void testSetup() {

		testNonNullImage = new Image();
		testNonNullImage.setFallback(false);
		testNonNullImage.setHeight(500);
		testNonNullImage.setWidth(500);
		testNonNullImage.setRatio("3_1");
		testNonNullImage.setUrl("https://s1.ticketm.net/dbimages/15646v.jpg");
		
		nonNullImageService = new VenueImageService(testNonNullImage);
		
		testNullImage = new Image();
		testNullImage.setFallback(null);
		testNullImage.setHeight(null);
		testNullImage.setWidth(null);
		testNullImage.setRatio(null);
		testNullImage.setUrl(null);
		
		nullImageService = new VenueImageService(testNullImage);
		
	}
	
	@Test
	public void testValidURL() {
		
		assertTrue(nonNullImageService.isURL("https://s1.ticketm.net/dbimages/15646v.jpg"));
	}
	
	@Test
	public void testNullURL() {
		
		assertFalse(nullImageService.isURL(null));
	}
	
	@Test
	public void testInvaildURL() {
		
		assertFalse(nullImageService.isURL("InvalidURL"));
	}
	
	

}
