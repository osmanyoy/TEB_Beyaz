package com.tebee.training.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "JMSTopic"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Topic")
		}, 
		mappedName = "JMSTopic")
public class MyTopicConsumer1 implements MessageListener {

    /**
     * Default constructor. 
     */
    public MyTopicConsumer1() {
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
			System.out.println("Topic Listener 1 : " + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
        
    }

}
