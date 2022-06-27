package com.example.springboot.service;

import org.springframework.stereotype.Service;

@Service("emailService")
public class TelephonicService implements DialService{

	@Override
	public void dialNumber(String message) {
		System.out.println(message);
	}

}
