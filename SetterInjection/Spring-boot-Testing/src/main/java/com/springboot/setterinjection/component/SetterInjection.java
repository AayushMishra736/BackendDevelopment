package com.springboot.setterinjection.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.setterinjection.service.TelephonicService;



@Component
public class SetterInjection {

	
	private TelephonicService telephonicService;

	@Autowired
	public void SetterInjection(TelephonicService telephonicService) {
		this.telephonicService = telephonicService;
	}



	public void dialNumber(String message) {
		telephonicService.calling(message);
	}
}
