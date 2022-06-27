package com.example.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.example.springboot.service.TelephonicService;

@Component
public class FieldInjection {

	@Autowired
	@Qualifier("dialService")
	private TelephonicService telephonicService;
	
	public void call(String message) {
		telephonicService.dialNumber(message);
	}
	
	
	
}
