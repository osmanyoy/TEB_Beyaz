package com.tebee.training.cdi.evet;

import javax.enterprise.event.Observes;

public class Listener1 {
	
	public void dinle1(@Dif1 @Observes String str) {
		System.out.println("Event Listener1 dinle1 geldi : " + str);
	}
	
	public void myEventObjectDinle1(@Observes MyEventObject eventObject) {
		System.out.println("MYEvent geldi Listener1 : " + eventObject.getEventStr());
	}
	
}
