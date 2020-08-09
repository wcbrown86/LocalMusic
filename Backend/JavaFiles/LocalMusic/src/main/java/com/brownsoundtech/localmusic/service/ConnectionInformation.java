package com.brownsoundtech.localmusic.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

/**
 * @author William C. Brown
 * @version 0.0.1
 * 
 * This class is only used for connection to vault to pull out the 
 * needed API key, and will be expanded as needed to add access to 
 * other keys and password as the application grows. 
 *
 */

@Data
@ConfigurationProperties("localmusic")
public class ConnectionInformation {
	
	private String liveNationKey;

}
