package com.teb.ee.cdi.event;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/event")
public class EventRest {

	@Inject
	@MyEventAnnoCritical
	private Event<String> myEvent;

	@Inject
	@MyEventAnnoWarning
	private Event<String> myEvent2;

	@GET
	public String fireEvent(@QueryParam("e") String str) {
		myEvent.fire(str);
		return "Event Fired : " + str;
	}

	@GET
	@Path("/2")
	public String fireEvent2(@QueryParam("e") String str) {
		myEvent2.fire(str);
		return "Event Fired : " + str;
	}

}
