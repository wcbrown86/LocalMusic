/**
 * 
 */
package LocalMusicServerApplet;

import java.util.List;


/**
 * <h3>
 *		About:
 * </h3>
 * 
 * 		This Class is used to update the list of Venues that the application checks. Each venue object 
 * 		will have the basic information needed. in that it will contain the name, address information, 
 * 		url, and promotional images. It also contains a variable that is used to tell the program how to 
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
	
	private String name, address, city, postalCode, contryCode, url,
			generalInfo, id, sourceAPI;
	private List<String> images;

	/**
	 * @param name
	 * @param address
	 * @param url
	 * @param generalInfo
	 * @param images
	 * @param id
	 * @param sourceAPI
	 */
	public LocalVenue(String vName, String vAddress, String vCity, String vPostalCode, String vContryCode, 
			String vUrl, String vGeneralInfo, List<String> vImages, String vId, String vSourceAPI) {
		
		
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
	public String getContryCode() {
		return contryCode;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @return the generalInfo
	 */
	public String getGeneralInfo() {
		return generalInfo;
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
	public List<String> getImages() {
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
	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @param generalInfo the generalInfo to set
	 */
	public void setGeneralInfo(String generalInfo) {
		this.generalInfo = generalInfo;
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
	public void setImages(List<String> images) {
		this.images = images;
	}

}
