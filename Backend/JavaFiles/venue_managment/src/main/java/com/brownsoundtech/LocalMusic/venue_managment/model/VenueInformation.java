package com.brownsoundtech.LocalMusic.venue_managment.model;

public class VenueInformation {
	
	private String phoneNumberDetail, openHoursDetail, acceptedPaymentDetail,
					willCallDetail, parkingDetail, accessibleSeatingDetail,
					generalRule, childRule;
	
	public String getPhoneNumberDetail() {
		return phoneNumberDetail;
	}

	public void setPhoneNumberDetail(String phoneNumberDetail) {
		this.phoneNumberDetail = phoneNumberDetail;
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
		
		return "";
	}

}
