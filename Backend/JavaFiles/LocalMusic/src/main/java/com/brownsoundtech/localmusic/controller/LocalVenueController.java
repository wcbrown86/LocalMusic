/**
 * 
 */
package com.brownsoundtech.localmusic.controller;

import com.brownsoundtech.localmusic.model.LocalVenue;
import com.brownsoundtech.localmusic.view.LocalVenueView;

/**
 * @author brown
 *
 */
public class LocalVenueController {
	
	LocalVenue model;
	LocalVenueView view;
	
	 public LocalVenueController(LocalVenue model, LocalVenueView view) {
		 
		 this.model = model;
		 this.view = view;
		 
	 }
	 
	 public String updateLocalVenueView() {
		 
		String outPut =  view.printVenueInformation(this);
		
		return outPut;
		 
	 }
	 
	 public void setLocalVenueName(String name) {
		 
		 model.setName(name);
		 
	 }
	 
	 public String getLocalVenueName() {
		 
		 return model.getName();
		 
	 }
	 
	 public void setLocalVenueAddress1(String address) {
		 
		 model.setAddress1(address);
		 
	 }
	 
	 public String getLocalVenueAddress1() {
		 
		 return model.getAddress1();
		 
	 }
	 
	 public void setLocalVenueAddress2(String Address) {
		 
		 model.setAddress2(Address);
		 
	 }
	 
	 public String getLocalVenueAddress2() {
		 
		 return model.getAddress2();
		 
	 }
	 
	 public void setLocalVenueCity(String city) {
		 
		 model.setCity(city);
		 
	 }
	 
	 public String getLocalVenueCity() {
		 
		 return model.getCity();
		 
	 }
	 
	 public void setLocalVenueState(String state) {
		 
		 model.setState(state);
		 
	 }
	 
	 public String getLocalVenueState() {
		 
		 return model.getState();
		 
	 }
	 
	 public void setLocalVenueZip(String zip) {
		 
		 model.setZip(zip);
		 
	 }
	 
	 public String getLocalVenueZip() {
		 
		 return model.getZip();
		 
	 }
	 
	 public void setLocalVenueLongitude(String longitude) {
		 
		 model.setLongitude(longitude);
		 
	 }
	 
	 public String getLocalVenueLongitude() {
		 
		 return model.getLongitude();
		 
	 }
	 
	 public void setLocalVenueLatitude(String latitude) {
		 
		 model.setLatitude(latitude);
		 
	 }
	 
	 public String getLocalVenueLatitude() {
		 
		 return model.getLatitude();
		 
	 }
	 
	 public void setLocalVenueWebAddress(String webAddress) {
		 
		 model.setWebAddress(webAddress);
		 
	 }
	 
	 public String getLocalVenueWebAddress() {
		 
		 return model.getWebAddress();
		 
	 }

}
