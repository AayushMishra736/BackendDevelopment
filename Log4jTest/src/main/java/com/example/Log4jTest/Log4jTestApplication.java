package com.example.Log4jTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jTestApplication {
	
	static Logger logger = LogManager.getLogger(Log4jTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jTestApplication.class, args);
		
		System.out.println("This is representation of all log level.");
		logger.trace("This is trace level log.");
		logger.debug("This is debug level log.");
		logger.info("This is info level log.");
		logger.warn("This is warn level log.");
		logger.error("This is error level log");
		logger.fatal("This is fatal level log");
	}

}
