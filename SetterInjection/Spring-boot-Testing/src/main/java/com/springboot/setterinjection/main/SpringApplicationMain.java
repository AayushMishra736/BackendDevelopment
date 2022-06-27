package com.springboot.setterinjection.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.setterinjection.component.SetterInjection;
import com.springboot.setterinjection.config.Config;



public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		SetterInjection setterInjection = ctx.getBean(SetterInjection.class);
		setterInjection.dialNumber("Calling a one person");
	}
}
