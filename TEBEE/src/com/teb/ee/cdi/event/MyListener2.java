package com.teb.ee.cdi.event;

import javax.enterprise.event.Observes;
import javax.inject.Named;

@Named
public class MyListener2 {

	public void abc(@Observes String s) {
		System.out.println("ALL Event Geldi : " + s);
	}
	
}
