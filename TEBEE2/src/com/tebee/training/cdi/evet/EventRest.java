package com.tebee.training.cdi.evet;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/event")
public class EventRest {
	
	@Inject
	@Dif1
	private Event<String> event1;
	
	@Inject
	private Event<String> event2;

	@Inject
	private Event<MyEventObject> event3;

	@GET
	@Path("/e1/{str}")
	public String fire1(@PathParam("str") String str) {
		event1.fire(str);
		return "OK";
	}
	@GET
	@Path("/e2/{str}")
	public String fire2(@PathParam("str") String str) {
		event2.fire(str);
		return "OK";
	}

	@GET
	@Path("/e3/{str}")
	public String fire3(@PathParam("str") String str) {
		MyEventObject eventObject = new MyEventObject();
		eventObject.setEventStr(str);
		event3.fire(eventObject);
		return "OK";
	}

}
