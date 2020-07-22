package com.brownsoundtech.localmusic;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brownsoundtech.localmusic.service.LiveNationVenueAPIConnection;

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
