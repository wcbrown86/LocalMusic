package com.brownsoundtech.LocalMusic.venue_managment.model;

/**
 * @author 	William Chad Brown
 * @date 	10/24/2019
 * 
 * @information
 * 			This class is for the box office and general information for each venue. This information 
 * 			is populated by the VenueInformationService.java class, that class will parse the information 
 * 			and will either fill the information provided or advise the customer to contact the venue for 
 * 			more information.
 * 
 * @version 1.0.0
 * 
 * 
 */

public class VenueInformation {
	
	private String boxOfficePhoneNumberDetail, openHoursDetail, acceptedPaymentDetail,
					willCallDetail, parkingDetail, accessibleSeatingDetail,
					generalRule, childRule;
	
	/**
	 * 
	 * Getter for the Box Office phone number
	 * 
	 * @return String equaling the Box Office Phone Number.
	 * 
	 */
	public String getPhoneNumberDetail() {
		return boxOfficePhoneNumberDetail;
	}
	
	/**
	 * Setter for the Box office Phone Number
	 * 
	 * @param phoneNumberDetail - String that holds the Box Office phone number.
	 * 
	 */
	public void setPhoneNumberDetail(String phoneNumberDetail) {
		this.boxOfficePhoneNumberDetail = phoneNumberDetail;
	}

	/**
	 * 
	 * Getter for Hours of operation for the box office
	 * 
	 * @return String containing the Hours of operation for the Box Office.
	 * 
	 */
	public String getOpenHoursDetail() {
		return openHoursDetail;
	}

	/**
	 * 
	 * Setter for the Box Office hours of operations.
	 * 
	 * @param openHoursDetail - String the holds the box office hours of operations.
	 * 
	 */
	public void setOpenHoursDetail(String openHoursDetail) {
		this.openHoursDetail = openHoursDetail;
	}

	/**
	 * Getter for the payment details for the Box Office
	 * 
	 * @return - String the shows the accepted payments for the Box Office.
	 * 
	 */
	public String getAcceptedPaymentDetail() {
		return acceptedPaymentDetail;
	}

	/**
	 * 
	 * Setter for the box office accepted payment information
	 * 
	 * @param acceptedPaymentDetail - String that holds the information for the accepted payment taken at the 
	 * 								box office
	 * 
	 */
	public void setAcceptedPaymentDetail(String acceptedPaymentDetail) {
		this.acceptedPaymentDetail = acceptedPaymentDetail;
	}

	/**
	 * 
	 * Getter for the will call details for the box office
	 * 
	 * @return String that holds the box office will call information. Used for customers to known
	 * 			where to pickup tickets bought in advance.
	 * 
	 */
	public String getWillCallDetail() {
		return willCallDetail;
	}

	/**
	 * 
	 * Setter for the will call information. This in the information customers use to find
	 * out how to pickup tickets bought in advance.
	 * 
	 * @param willCallDetail - String containing will call information.
	 * 
	 */
	public void setWillCallDetail(String willCallDetail) {
		this.willCallDetail = willCallDetail;
	}

	/**
	 * 
	 * Getter for the parking information for the venue. 
	 * 
	 * @return - String that contains the information in regards to parking. 
	 * 
	 */
	public String getParkingDetail() {
		return parkingDetail;
	}

	/**
	 * 
	 * Setter for that parking information for the venue. 
	 * 
	 * @param parkingDetail - String that contains information about the parking information
	 * 						 for the venue.
	 * 
	 */
	public void setParkingDetail(String parkingDetail) {
		this.parkingDetail = parkingDetail;
	}

	/**
	 * 
	 * Getter for the accessible seating information for the veneue, this would be 
	 * seating information for wheel chairs and the alike. 
	 * 
	 * @return - String that contains the information about accessible seating.
	 * 
	 */
	public String getAccessibleSeatingDetail() {
		return accessibleSeatingDetail;
	}

	/**
	 * 
	 * Setter for the accessible seating information. 
	 * 
	 * @param accessibleSeatingDetail - String that contains the accessible seating information.
	 * 									information that is used for wheel chair access and the alike.
	 * 
	 */
	public void setAccessibleSeatingDetail(String accessibleSeatingDetail) {
		this.accessibleSeatingDetail = accessibleSeatingDetail;
	}

	/**
	 * 
	 * Getter for the general information for the venue. 
	 * 
	 * @return - String that holds the information that the venue wants to relay to the public.
	 * 
	 */
	public String getGeneralRule() {
		return generalRule;
	}

	/**
	 * 
	 * Setter for the general information for the venue, this can be any information that does not 
	 * fall with the other setting for the venue. It can be any information the venue wants to relay to 
	 * the public.
	 * 
	 * @param generalRule - String that holds general information for the venue.
	 * 
	 */
	public void setGeneralRule(String generalRule) {
		this.generalRule = generalRule;
	}

	/**
	 * 
	 * Getter that holds the rules for under age patrons. 
	 * 
	 * @return - String that provides the rules the venue holds for under age patrons. 
	 * 
	 */
	public String getChildRule() {
		return childRule;
	}

	/**
	 * 
	 * Setter for the child rule information, this information is rules the venues have for under age 
	 * patrons.
	 * 
	 * @param childRule - String that holds the child rule information.
	 * 
	 */
	public void setChildRule(String childRule) {
		this.childRule = childRule;
	}

	 
	@Override
	/**
	 * 
	 * The toString() method returns the information from this class formatted in a easily readable 
	 * format that list the information with a heading so that required information can be found quickly.
	 * 
	 */
	public String toString() {
		String phoneNumber = String.format("Box Office Phone Number: \n\t%s", boxOfficePhoneNumberDetail);
		String openHours = String.format("Hours Of Opperation: \n\t%s", openHoursDetail);
		String willCall = String.format("Will Call Information: \n\t%s", willCallDetail);
		String paymentInformation = String.format("Accepted Payment Information: \n\t%s", acceptedPaymentDetail);
		String parking = String.format("Parking Information: \n\t%s", parkingDetail);
		String general = String.format("General Information: \n\t%s", generalRule);
		String child = String.format("Child Rule Information \n\t%s", childRule);
		String accessibleSeating = String.format("Accessible Seating Information \n\t%s", accessibleSeatingDetail);
		
		String fullOutPut = String.format("%s \n%s \n%s \n%s \n%s \n%s \n%s \n%s", phoneNumber, openHours, willCall, paymentInformation, parking, general, child, accessibleSeating);
		
		return fullOutPut;
	}

}
