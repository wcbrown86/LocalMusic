/**
 * 
 */
package LocalMusicServerApplet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/**
 * <h3>
 *		About:
 * </h3>
 * 
 * 		This Class is used to update the list of venues that the application checks. Each venue object 
 * 		will have the basic information needed. in that it will contain the name, address information, 
 * 		URL, and promotional images. It also contains a variable that is used to tell the program how to 
 * 		collect the events for this venue. So if the venue is listed with Live Nation, or another service
 * 		this field will tell the application how to update the events information. 
 *
 *
 * @author 		William Brown
 * @copyright 	Apr 18, 2019
 * @version		0.0.1
 * 
 * TODO
 *
 */
public class LocalVenue {
	
	private String name, address, city, postalCode, countryCode, url,
			id, sourceAPI;
	private ArrayList<String> images;
	private Queue<LocalEvent> eventsList;

	/**
	 * @param vName : A string that represents the name of the venue.
	 * @param vAddress : A String that represents the street address information. 
	 * @param vCity : A String that represents the City information.
	 * @param vPostalCode : A String that represents the Postal Code or Zip Code information.
	 * @param vCountryCode : A String that represents the Country Code information. e.g. US for United States
	 * @param vUrl : A String that represents the venues website URL. 
	 * @param vImages : A collection of URLs that point to images the venue has provided for promotion.
	 * @param vId : A string that represents the ID of the venue. Could be for the API like Live Nation or other ID's
	 * @param vSourceAPI : A string that represents the API source the application uses to get updated information. 
	 */
	public LocalVenue(String vName, String vAddress, String vCity, String vPostalCode, String vCountryCode, 
			String vUrl, ArrayList<String> vImages, String generalInformation, String vId, String vSourceAPI) {
		
		name = vName;
		address = vAddress;
		city = vCity;
		postalCode = vPostalCode;
		countryCode = vCountryCode;
		url = vUrl;
		id = vId;
		sourceAPI = vSourceAPI;
		images = vImages;
		
		
		eventsList = new LinkedList<LocalEvent>();
		
		
		
	}

	/**
	 * @return the eventsList
	 */
	public Queue<LocalEvent> getEventsList() {
		return eventsList;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @return the contryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the sourceAPI
	 */
	public String getSourceAPI() {
		return sourceAPI;
	}

	/**
	 * @return the images
	 */
	public ArrayList<String> getImages() {
		return images;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @param contryCode the contryCode to set
	 */
	public void setCountryCode(String contryCode) {
		this.countryCode = contryCode;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param sourceAPI the sourceAPI to set
	 */
	public void setSourceAPI(String sourceAPI) {
		this.sourceAPI = sourceAPI;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(ArrayList<String> images) {
		this.images = images;
	}

}
