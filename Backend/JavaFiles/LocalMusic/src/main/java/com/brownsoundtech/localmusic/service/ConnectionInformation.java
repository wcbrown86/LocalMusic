/**
 * 
 */
package com.brownsoundtech.localmusic.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * @author brown
 *
 */

@Data
@ConfigurationProperties("localmusic")
public class ConnectionInformation {
	
	private String liveNationKey;

}
