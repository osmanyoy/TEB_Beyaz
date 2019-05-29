package com.tebee.training.calc;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/hesap")
public class CalcRest {
	
	@Inject
	private Calculator calc;
	
	@GET
	@Path("/menu")
	public String menu() {
		return calc.menu();
	}
	
	@GET
	@Path("/op/{opIndex}")
	public String operasyon(@PathParam("opIndex") int opIndex) {
		return calc.operasyon(opIndex);
	}

	@GET
	@Path("/yap/{val1}/{val2}")
	public String yap(@PathParam("val1")int value1,@PathParam("val2")int value2) {
		return calc.yap(value1,value2);
	}

}
