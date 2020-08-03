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

	@Override
	public void run(String... args) throws Exception {
		
		liveNationAPIKey = connectionInformation.getLiveNationKey();
		System.out.print(liveNationAPIKey);
		
	}
	
	

}
