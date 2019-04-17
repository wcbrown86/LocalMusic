import java.net.MalformedURLException;


import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class GetLiveNationEvents implements APIServerConnect {

	URL ROOTAPIURL = new URL("https://app.ticketmaster.com/discovery/v2/");
	
	public GetLiveNationEvents() throws MalformedURLException {}
	
	
	public void establishAPIConnection() {
		// TODO Auto-generated method stub

	}

	
	public void closeAPIConnection() {
		// TODO Auto-generated method stub

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

	public void pushToSQL(ArrayList<Event> events) {
		// TODO Auto-generated method stub

	}

	
	public void closeSQLConnection() {
		// TODO Auto-generated method stub

	}

	
	public void garbageCollection() {
		// TODO Auto-generated method stub

	}

}
