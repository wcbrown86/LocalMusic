
package LocalMusicServerApplet;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Queue;

import com.ticketmaster.api.discovery.DiscoveryApi;
import com.ticketmaster.api.discovery.operation.SearchEventsOperation;
import com.ticketmaster.api.discovery.response.PagedResponse;
import com.ticketmaster.discovery.model.Event;
import com.ticketmaster.discovery.model.Events;

/**
 * <h3>
 *		About:
 * </h3>
 *
 *
 * @author 		William Brown
 * @copyright 	Apr 18, 2019
 * @version		0.0.1
 * 
 * TODO
 *
 */
public class GetLiveNationEvents implements UpdateEvents{
	
	private String APIKey;
	
	public GetLiveNationEvents(String key) {
		
		APIKey = key;
	}
	

	@Override
	public void establishAPIConnection() {
		// TODO Auto-generated method stub
		DiscoveryApi apiConnect = new DiscoveryApi(APIKey);
		
		try {
			PagedResponse<Events> events = apiConnect.searchEvents(new SearchEventsOperation().venueId("KovZpZAEkeaA"));
			List<Event> eventsList = events.getContent().getEvents();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	@Override
	public void closeAPIConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parseData(String json) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalEvent createEventObject(LocalVenue venue, Date date, LocalBand[] bands, float[] price, URL eventURL, URL promoPhoto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void establishSQLConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pushToSQL(Queue<LocalEvent> events) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeSQLConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void garbageCollection() {
		// TODO Auto-generated method stub
		
	}

}
