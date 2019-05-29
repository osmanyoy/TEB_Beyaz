package com.tebee.training.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

@JMSDestinationDefinitions(
		{
		@JMSDestinationDefinition(destinationName = "JMSQueue",
									name = "java:/jms/queue/JMSQueue",
									interfaceName = "javax.jms.Queue")
		,@JMSDestinationDefinition(destinationName = "JMSTopic",
									name = "java:/jms/queue/JMSTopic",
											interfaceName = "javax.jms.Topic")
		}
		)

@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "JMSQueue"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "JMSQueue")
public class MyQueueConsumer1 implements MessageListener {

    /**
     * Default constructor. 
     */
    public MyQueueConsumer1() {
    }
	
	/**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
       TextMessage textMessage = (TextMessage) message;
       System.out.println("Listener1 : " + message);
        
    }

}
