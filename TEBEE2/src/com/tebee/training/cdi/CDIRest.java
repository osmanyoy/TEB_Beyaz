package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/cdi")
@SessionScoped
public class CDIRest implements Serializable {

	@Inject
	@Named("abc")
	private IProcess process;
	
	@Inject
	@Named("xyz")
	private IProcess process2;

	@Inject
	@MyQualifier
	private IProcess process3;

	@Inject
	@Alternative
	private IProcess process4;

	@GET
	@Path("/proc1/{str}")
	public String process(@PathParam("str") String str) {
		return process.processString(str);
	}

	@GET
	@Path("/proc2/{str}")
	public String process2(@PathParam("str") String str) {
		return process2.processString(str);
	}

	@GET
	@Path("/proc3/{str}")
	public String process3(@PathParam("str") String str) {
		return process3.processString(str);
	}

	@GET
	@Path("/proc4/{str}")
	public String process4(@PathParam("str") String str) {
		return process4.processString(str);
	}

}
