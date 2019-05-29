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
				propertyName = "destination", propertyValue = "JMSQueue"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "JMSQueue")
public class MyQueueConsumer2 implements MessageListener {

    /**
     * Default constructor. 
     */
    public MyQueueConsumer2() {
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
			System.out.println("Listener2 : " + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
        
    }

}
