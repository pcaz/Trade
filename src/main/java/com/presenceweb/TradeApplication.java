package com.presenceweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TradeApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(TradeApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(TradeApplication.class, args);
	}
	@Override
	   public void run(String... arg0) throws Exception {
	 logger.warn("Trade application is started");
	}
}
