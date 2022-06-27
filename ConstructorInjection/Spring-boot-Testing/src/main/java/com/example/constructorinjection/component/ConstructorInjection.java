package com.example.constructorinjection.component;


import org.springframework.stereotype.Component;

import com.example.constructorinjection.service.TelephoneService;





@Component
public class ConstructorInjection {

	
	private TelephoneService telephoneService;
	
	public ConstructorInjection(TelephoneService telephoneService) {
		super();
		this.telephoneService = telephoneService;
	}

	public void dial(String message) {
		telephoneService.callNumber(message);
	}
}
