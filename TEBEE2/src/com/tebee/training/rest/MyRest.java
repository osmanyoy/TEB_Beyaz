package com.tebee.training.rest;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.jws.WebService;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.tebee.training.ejb.MyStatelessEJB;

@Path("/myrest")
@WebService
@SessionScoped
public class MyRest implements Serializable {
	
	private int count = 0;
	
	@EJB
	private MyStatelessEJB msEJB;
	
	public MyRest() {
	}
	
	@PostConstruct
	public void abcdf() {
		msEJB.calc(10, 10);
	}
	
	@PreDestroy
	public void zxcv() {
		System.out.println("Destroy");
	}
	
	
	@GET
	@Path("/calc/{val1}/{val2}")
	public int calc(@PathParam("val1")int a,@PathParam("val2")int b) {
		return msEJB.calc(a, b);
	}
	
	@GET
	@Path("/count")
	public String count() {
		return "Counter is " + (++count);
	}


	@GET
	public String hello() {
		return "Hello from first rest service";
	}
	
	@POST
	public String hello2() {
		return "Hello 2 from first rest service";
	}
	
	@PUT
	public String hello3() {
		return "Hello 3 from first rest service";
	}
	
	@GET
	@Path("/v4")
	public String hello4() {
		return "Hello 4 from first rest service";
	}

	@GET
	@Path("/v5/{isim}/{soyisim}")
	public String hello5(	@PathParam("isim") String name,
							@PathParam("soyisim")String surname) {
		return "Hello 5 from first rest service " + name  +  " " + surname;
	}

	// http://127.0.0.1:8080/TEBEE2/rest/myrest/v6?isim=osman&soyisim=yaycioglu
	@GET
	@Path("/v6")
	public String hello6(	@QueryParam("isim") String name,
							@QueryParam("soyisim")String surname) {
		return "Hello 6 from first rest service " + name  +  " " + surname;
	}

	@GET
	@Path("/v7/{isim}")
	public String hello7(	@PathParam("isim") String name,
							@QueryParam("soyisim")String surname) {
		return "Hello 7 from first rest service " + name  +  " " + surname;
	}
	
	@GET
	@Path("/v8")
	public String hello8(	@HeaderParam("isim") String name,
							@HeaderParam("soyisim")String surname) {
		return "Hello 8 from first rest service " + name  +  " " + surname;
	}

	@GET
	@Path("/v9/{isim}")
	public String hello9(	@BeanParam Student std) {
		return "Hello 9 from first rest service " 
					+ std.getName() +  " " 
					+ std.getSurname() 
					+ " age : " + std.getAge() 
					+ " AVG : " + std.getAvg();
	}
	
	@POST
	@Path("/v10")
	public String hello10(	Student std) {
		return "Hello 10 from first rest service " 
					+ std.getName() +  " " 
					+ std.getSurname() 
					+ " age : " + std.getAge() 
					+ " AVG : " + std.getAvg();
	}

	@POST
	@Path("/v11")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public StudentCalc hello11(	@Valid Student std) {
		StudentCalc calc = new StudentCalc();
		calc.setName(std.getName() + " " + std.getSurname());
		calc.setCalcValue(std.getAvg() * std.getAge());
		return calc;
	}

}













