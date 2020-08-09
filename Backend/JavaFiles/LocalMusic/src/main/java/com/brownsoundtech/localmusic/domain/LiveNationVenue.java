package com.brownsoundtech.localmusic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author William C. Brown
 * @version 0.0.1
 * 
 * This class is used to leverage the Faster XML jackson tool to parse the Live Nation
 * API. It contains nested classes to cover the JSON objects that are nested into the information
 * that is provided by the API. The Lombok tools are also leverage to reduce lines of code that 
 * need to be written. Lombok is used to create getters and setters and default constructors. 
 * This file will need to be updated as the API information is updated. 
 *
 */


@ToString
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(value = {"type", "_links", "markets", "dma", "test", "distance", "units", "description", "additionalInfo",
		"timezone", "currency", "social", "boxOfficeInfo", "parkingDetail", "accessibleSeatingDetail", "generalInfo", "externalLinks", 
		"aliases", "localizedAliases", "upcommingEvents", "ada", "id", "locale", "images"})

public class LiveNationVenue {
	
	private String name;
	private String url;
	private Country country;
	private State state;
	private City city;
	private String postalCode;
	private Address address;
	private Location location;
	
	
	@ToString
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Location{
		private String longitude;
		private String latitude;
	}
	
	@ToString
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Address{
		private String line1;
		private String line2;
		private String line3;
	}
	
	@ToString
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Country{
		private String name;
		private String countryCode;
	}
	
	@ToString
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class State{
		private String name;
		private String stateCode;
	}
	
	@ToString
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class City{
		private String city;
	}
	
	
	

}
