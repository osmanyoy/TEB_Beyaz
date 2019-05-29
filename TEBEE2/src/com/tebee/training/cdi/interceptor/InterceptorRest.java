package com.tebee.training.cdi.interceptor;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/intercept")
public class InterceptorRest {
	
	@Inject
	private Test test;
	
	@GET
	public String hello() {
		return test.helloWorld();
	}
	
}
