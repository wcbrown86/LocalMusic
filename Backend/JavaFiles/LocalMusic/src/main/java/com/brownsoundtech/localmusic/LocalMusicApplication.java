package com.brownsoundtech.localmusic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.brownsoundtech.localmusic.service.ConnectionInformation;
/**
 * 
 * @author William Chad Brown
 * @version 0.0.1
 * 
 * This is the main source control for the application, and will be used to determine 
 * what update feature will be used. It will be called and passed information on if 
 * venue or even information needs to be checked and updated. 
 *
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(ConnectionInformation.class)
public class LocalMusicApplication implements  CommandLineRunner{
	
	private String liveNationAPIKey;
	private ConnectionInformation connectionInformation;
	
	public LocalMusicApplication(ConnectionInformation connectionInformation) {
		this.connectionInformation = connectionInformation;
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalMusicApplication.class, args);
	}

	/**
	 * 
	 * Overridden method that is used to grab the API key from the 
	 * vault container. This will also be expanded to access other
	 * API and login keys that might be needed to run the overall
	 * program. 
	 * 
	 * To Do items: 
	 * If the applicaiton is moved into production the print call 
	 * must be removed. 
	 * 
	 * 
	 */
	@Override
	public void run(String... args) throws Exception {
		
		liveNationAPIKey = connectionInformation.getLiveNationKey();

		//Just used for verification of the application. Must be removed when moved
		//into production. 
		System.out.print(liveNationAPIKey);
		
	}
	
	

}
