package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Log4jTest.Log4jTestApplication;

@RestController
public class Controller {
	
	static Logger logger = LogManager.getLogger(Log4jTestApplication.class);

	@GetMapping("/Hello")
	public String test(){
		logger.info("Controller executing....");
		return "Hello this simple java application.";	
	}
}
