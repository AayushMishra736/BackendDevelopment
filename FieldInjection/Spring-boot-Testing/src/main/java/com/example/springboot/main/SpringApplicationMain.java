package com.example.springboot.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springboot.component.FieldInjection;
import com.example.springboot.config.Config;



public class SpringApplicationMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		FieldInjection fieldnjection = ctx.getBean(FieldInjection.class);
		fieldnjection.call("Calling a person using telephone.");
	}
}
 