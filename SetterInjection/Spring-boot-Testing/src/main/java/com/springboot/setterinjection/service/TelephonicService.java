package com.springboot.setterinjection.service;

import org.springframework.stereotype.Service;

@Service
public class TelephonicService implements CallingService{

    @Override
	public void calling(String message) {
		System.out.println(message);	
		
	}

}
