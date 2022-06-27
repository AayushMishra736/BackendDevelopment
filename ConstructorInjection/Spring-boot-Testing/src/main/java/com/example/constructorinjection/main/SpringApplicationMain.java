package com.example.constructorinjection.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.constructorinjection.component.ConstructorInjection;
import com.example.constructorinjection.config.Config;



public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		ConstructorInjection fieldnjection = ctx.getBean(ConstructorInjection.class);
		fieldnjection.dial("Calling person using telephone.");
	}

}