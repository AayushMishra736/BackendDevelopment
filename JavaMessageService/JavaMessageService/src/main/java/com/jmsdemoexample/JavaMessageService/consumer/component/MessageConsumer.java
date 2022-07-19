package com.jmsdemoexample.JavaMessageService.consumer.component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jmsdemoexample.JavaMessageService.Model.SystemMessage;

@Component
public class MessageConsumer implements MessageConverter {

//	private static final Logger log = LoggerFactory.getLogger(MessageConsumer.class);
//	
//	@JmsListener(destination = "bridgingcode-queue")
//	public void messageListener(SystemMessage systemMessage) {
//	log.info("Message received. {}",systemMessage);
//	}
	
	private final ObjectMapper mapper;

    public MessageConsumer(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public javax.jms.Message toMessage(Object object, Session session) throws MessageConversionException {
        try {
            // send class=<json content>
            return session.createTextMessage(object.getClass().getName() + "=" + mapper.writeValueAsString(object));
        } catch (Exception e) {
            throw new MessageConversionException("Message cannot be serialized", e);
        }
    }

    @Override
    public Object fromMessage(javax.jms.Message message) throws JMSException, MessageConversionException {
        try {
            Matcher matcher = Pattern.compile("^([^=]+)=(.+)$").matcher(((TextMessage) message).getText());
            if (!matcher.find())
            {
                throw new MessageConversionException("Message is not of the expected format: class=<json content>");
            }
            return mapper.readValue(matcher.group(2), Class.forName(matcher.group(1)));
        } catch (Exception e) {
            throw new MessageConversionException("Message cannot be deserialized", e);
        }
    }

	
}
