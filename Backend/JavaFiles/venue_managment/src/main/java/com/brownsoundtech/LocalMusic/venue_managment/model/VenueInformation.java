package com.brownsoundtech.LocalMusic.venue_managment.model;

public class VenueInformation {
	
	private String boxOfficePhoneNumberDetail, openHoursDetail, acceptedPaymentDetail,
					willCallDetail, parkingDetail, accessibleSeatingDetail,
					generalRule, childRule;
	
	public String getPhoneNumberDetail() {
		return boxOfficePhoneNumberDetail;
	}

	public void setPhoneNumberDetail(String phoneNumberDetail) {
		this.boxOfficePhoneNumberDetail = phoneNumberDetail;
	}

	public String getOpenHoursDetail() {
		return openHoursDetail;
	}

	public void setOpenHoursDetail(String openHoursDetail) {
		this.openHoursDetail = openHoursDetail;
	}

	public String getAcceptedPaymentDetail() {
		return acceptedPaymentDetail;
	}

	public void setAcceptedPaymentDetail(String acceptedPaymentDetail) {
		this.acceptedPaymentDetail = acceptedPaymentDetail;
	}

	public String getWillCallDetail() {
		return willCallDetail;
	}

	public void setWillCallDetail(String willCallDetail) {
		this.willCallDetail = willCallDetail;
	}

	public String getParkingDetail() {
		return parkingDetail;
	}

	public void setParkingDetail(String parkingDetail) {
		this.parkingDetail = parkingDetail;
	}

	public String getAccessibleSeatingDetail() {
		return accessibleSeatingDetail;
	}

	public void setAccessibleSeatingDetail(String accessibleSeatingDetail) {
		this.accessibleSeatingDetail = accessibleSeatingDetail;
	}

	public String getGeneralRule() {
		return generalRule;
	}

	public void setGeneralRule(String generalRule) {
		this.generalRule = generalRule;
	}

	public String getChildRule() {
		return childRule;
	}

	public void setChildRule(String childRule) {
		this.childRule = childRule;
	}

	//TODO: Implement toString override. 
	@Override
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
