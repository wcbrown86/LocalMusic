package com.brownsoundtech.repository;

import java.net.URL;
import java.util.Date;
import java.util.Queue;

import com.brownsoundtech.model.LocalBand;
import com.brownsoundtech.model.LocalEvent;
import com.brownsoundtech.model.LocalVenue;

/**
 * <h4>
 * About:	
 * <p>
 * 			This interface is the outline of the all the sub classes that will connect 
 * 			to outside API's like Live Nation. This will be used to keep all the 
 * 			connection classes constant. Each class will connect to the API then pull 
 * 			the needed information from the venues. Then parse the JSON and create objects 
 * 			that contain the information for each even retrieved. Once complete the event
 * 			objects will be passed to a class that will store the gathered information 
 * 			in the LiveMusic database.
 * </h4>
 * 
 * @author 		William Brown
 * @since		04/16/2019
 * @version		0.0.1
 *  
 *
 */


public interface UpdateEvents {
	
	public void establishAPIConnection();
	
	void closeAPIConnection();
	
	void parseData(String json);
	
	LocalEvent createEventObject(LocalVenue venue, Date date, LocalBand[] bands, float[] price, URL eventURL, URL promoPhoto);
	
	void establishSQLConnection();
	
	void pushToSQL(Queue<LocalEvent> events);
	
	void closeSQLConnection();
	
	void garbageCollection();
	
}