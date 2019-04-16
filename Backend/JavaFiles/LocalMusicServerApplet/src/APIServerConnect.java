
/**
 * @author 	William Brown
 * @date	04/16/2019
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

}
