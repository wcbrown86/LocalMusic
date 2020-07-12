

package com.brownsoundtech.localmusic.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author brown
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
