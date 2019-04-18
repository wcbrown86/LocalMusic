import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Queue;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * <h4>
 * About:	
 * <p>
 * 			This Class implements the APIServerConnect Interface to connect to the Live
 * 			Nation events API. This class takes in the venue ID that is set by Live Nation 
 * 			and the API Key needed to access the API. It then takes the JSON that is returned by 
 * 			Live Nation and parses this information to pull out each events information. Then the 
 * 			event information is pushed to the SQL server that stores all the events from the multiple	
 * 			event services. 
 * </h4>
 * 
 * @author 		William Brown
 * @since		04/16/2019
 * @version		0.0.1
 *  
 *
 */

public class GetLiveNationEvents implements APIServerConnect {

	static final String ROOTURL = "https://app.ticketmaster.com/discovery/v2/events.json?venueId=";
	URL urlCombined;
	HttpURLConnection urlConnection;
	
	public GetLiveNationEvents(String venueID, String key){
		
		try {
			urlCombined = new URL(ROOTURL + venueID + "&apikey=" + key);
			establishAPIConnection();
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public void establishAPIConnection() {
		
		
		try {
			urlConnection = (HttpURLConnection) urlCombined.openConnection();

			urlConnection.setRequestMethod("GET");
			urlConnection.connect();
			int status = urlConnection.getResponseCode();

	        if (status == HttpURLConnection.HTTP_OK) {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	            StringBuilder builder = new StringBuilder();
	            String line = reader.readLine();
	
	            while (line != null) {
	                builder.append(line);
	                line = reader.readLine();
	            }
	
	            parseJSON(builder.toString());
	            System.out.println(builder.toString());
	        }
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			closeAPIConnection();
			
		}

	}

	
	public void closeAPIConnection() {
		
		urlConnection.disconnect();

	}

	
	public void parseJSON(String json) {
		
		try {
			
			JSONObject object = new JSONObject(json);
            JSONArray eventsArray = object.getJSONArray("events");
            
            for(int i = 0; i < eventsArray.length(); i++) {
            	
            	JSONObject eventObject = eventsArray.getJSONObject(i);
            }
			
		} catch (JSONException e) {
			
			e.printStackTrace();
			
		}

	}

	public Event createEventObject(Venue venue, Date date, Band[] bands, float[] price, URL eventURL, URL promoPhoto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void establishSQLConnection() {
		// TODO Auto-generated method stub

	}

	public void pushToSQL(Queue<Event> events) {
		// TODO Auto-generated method stub

	}

	
	public void closeSQLConnection() {
		// TODO Auto-generated method stub

	}

	
	public void garbageCollection() {
		// TODO Auto-generated method stub

	}

}
