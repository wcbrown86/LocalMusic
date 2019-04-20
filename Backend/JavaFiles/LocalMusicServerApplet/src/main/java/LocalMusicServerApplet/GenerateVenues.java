/**
 * 
 */
package LocalMusicServerApplet;

import java.util.LinkedList;

/**
 * <h3>
 *		About:
 * </h3>
 *
 *
 * @author 		William Brown
 * @copyright 	Apr 20, 2019
 * @version		0.0.1
 * 
 * TODO
 *
 */
public interface GenerateVenues {
	
	
	public LinkedList<LocalVenue> gatherVenues(String countryCode);
	
	public LocalVenue createVenueObject( Object object);

}
