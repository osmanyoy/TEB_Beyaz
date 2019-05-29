package com.tebee.training.cdi.evet;

import javax.enterprise.event.Observes;

public class Listener2 {
	
	public void dinle1(@Observes String str) {
		System.out.println("Event Listener2 dinle1 geldi : " + str);
	}
	
}
