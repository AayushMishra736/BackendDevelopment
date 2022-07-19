package com.jmsdemoexample.JavaMessageService.consumer.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer
{

	private final JmsTemplate jmsTemplate;

	@Autowired
	public MessageConsumer(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

}
