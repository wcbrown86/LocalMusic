


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Queue;
import java.util.Date;

public class GetLiveNationEvents implements APIServerConnect {

	static final String ROOTURL = "https://app.ticketmaster.com/discovery/v2/events.json?postalCode=";
	URL urlCombined;
	HttpURLConnection urlConnection;
	
	public GetLiveNationEvents(String zip, String key){
		
		try {
			urlCombined = new URL(ROOTURL + zip + "&apikey=" + key);
			establishAPIConnection();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void establishAPIConnection() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub

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
