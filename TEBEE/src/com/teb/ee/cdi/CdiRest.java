package com.teb.ee.cdi;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/cdi")
@SessionScoped
public class CdiRest implements Serializable{
	
	@Inject
	@Named("osman")
	private IExecutor executor1;
	
	@Inject
	@Named("1234")
	private IExecutor executor2;

	@Inject
	// @Named("dfg")
	@MyExecuteAnno
	private IExecutor executor3;

	@Inject
	@Alternative
	private IExecutor executor4;

	@GET
	public String hello() {
		return "Hello";
	}
	
	@GET
	@Path("/exe1")
	public String execute1(@QueryParam("n") String name) {
		return executor1.execute(name);
	}
	
	@GET
	@Path("/exe2")
	public String execute2(@QueryParam("n") String name) {
		return executor2.execute(name);
	}
	
	@GET
	@Path("/exe3")
	public String execute3(@QueryParam("n") String name) {
		return executor3.execute(name);
	}

	@GET
	@Path("/exe4")
	public String execute4(@QueryParam("n") String name) {
		return executor4.execute(name);
	}

}
