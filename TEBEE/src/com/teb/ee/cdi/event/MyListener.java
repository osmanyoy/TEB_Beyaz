package com.teb.ee.cdi.event;

import javax.enterprise.event.Observes;
import javax.inject.Named;

@Named
public class MyListener {

	public void abc(@Observes @MyEventAnnoWarning String s) {
		System.out.println("Warning Event Geldi : " + s);
	}
	
	public void abc2(@Observes @MyEventAnnoCritical String s) {
		System.out.println("Critical Event Geldi : " + s);
	}

}
