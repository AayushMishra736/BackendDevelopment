package com.example.constructorinjection.service;

import org.springframework.stereotype.Service;

@Service
public class TelephoneService implements DialService{



	@Override
	public void callNumber(String message) {
		System.out.println(message);	
	}

}
