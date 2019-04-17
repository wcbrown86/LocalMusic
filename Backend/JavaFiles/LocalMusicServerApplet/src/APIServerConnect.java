import java.net.URL;
import java.util.Date;
import java.util.ArrayList;

/**
 * @author 		William Brown
 * @Copyright	04/16/2019
 * @version		0.0
 * 
 * About:	This interface is the outline of the all the sub classes that will connect 
 * 			to outside API's like Live Nation. This will be used to keep all the 
 * 			connection classes constant. Each class will connect to the API then pull 
 * 			the needed information from the venues. Then parse the JSON and create objects 
 * 			that contain the information for each even retrieved. Once complete the event
 * 			objects will be passed to a class that will store the gathered information 
 * 			in the LiveMusic database. 
 *
 */


public interface APIServerConnect {
	
	public void establishAPIConnection();
	
	void closeAPIConnection();
	
	void parseJSON(String json);
	
	Event createEventObject(Venue venue, Date date, Band[] bands, float[] price, URL eventURL, URL promoPhoto);
	
	void establishSQLConnection();
	
	void pushToSQL(ArrayList<Event> events);
	
	void closeSQLConnection();
	
	void garbageCollection();
	
}
