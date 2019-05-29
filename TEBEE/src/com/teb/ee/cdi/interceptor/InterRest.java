package com.teb.ee.cdi.interceptor;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/inter")
public class InterRest {

	@Inject
	private MyObject myObject;
	
	@GET
	public String hello() {
		return myObject.hello();
	}
	
}
