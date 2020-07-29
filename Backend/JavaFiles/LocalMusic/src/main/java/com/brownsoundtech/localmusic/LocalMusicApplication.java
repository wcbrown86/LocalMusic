package com.brownsoundtech.localmusic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brownsoundtech.localmusic.service.LiveNationVenueAPIConnection;
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
public class LocalMusicApplication {
	
	@Value("${LiveNationKey}")
	private static String key;

	public static void main(String[] args) {
		SpringApplication.run(LocalMusicApplication.class, args);
	
		LiveNationVenueAPIConnection test = new LiveNationVenueAPIConnection();
		
		
		
		System.out.println(key);
	}
	
	

}
