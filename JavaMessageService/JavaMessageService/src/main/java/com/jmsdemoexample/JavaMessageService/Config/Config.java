package com.jmsdemoexample.JavaMessageService.Config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class Config {
	
	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
	DefaultJmsListenerContainerFactory	jmsListenerContainerFactory = 
			new DefaultJmsListenerContainerFactory();
		
	jmsListenerContainerFactory.setConnectionFactory(connectionFactory);	
	jmsListenerContainerFactory.setConcurrency("5-10");
		
		return jmsListenerContainerFactory;
		
	}
	

}
