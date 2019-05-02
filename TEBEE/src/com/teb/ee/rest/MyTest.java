package com.teb.ee.rest;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.teb.ee.ejb.MySingletonEJB;
import com.teb.ee.jpa.Employee;
import com.teb.ee.jpa.EmployeeDAO;

@Path("/test")
public class MyTest {
	
	@EJB
	private EmployeeDAO empDAO;
	
	@EJB
	private MySingletonEJB msEjb;

	@GET
	@Path("/random")
	public String random() {
		Future<String> asyncTest = msEjb.asyncTest();
		System.out.println("Next line processed");
		try {
			String string = asyncTest.get();
			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String string = asyncTest.get(1000, TimeUnit.MILLISECONDS);
			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (asyncTest.isDone()) {
				String string = asyncTest.get();
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return msEjb.randomStr();
	}

	@GET
	public String hello() {
		return "Merhaba Dünya";
	}

	@POST
	public String hello3() {
		return "Merhaba Dünya v3";
	}

	@GET
	@Path("/v2")
	public String hello2() {
		return "Merhaba Dünya v2";
	}

	@GET
	@Path("/v4")
	public String hello4(@QueryParam("isim") String name, @QueryParam("soyisim") String sirname) {
		return "Merhaba Dünya v4 " + name + " " + sirname;
	}

	@GET
	@Path("/v5/{isim}/{soyisim}")
	public String hello5(@PathParam("isim") String name, @PathParam("soyisim") String sirname,
			@QueryParam("yas") int age, @HeaderParam("cins") String gender) {
		return "Merhaba Dünya v5 " + name + " " + sirname + " " + age + " " + gender;
	}

	@POST
	@Path("/v6/{isim}/{soyisim}")
	public String hello6(@PathParam("isim") String name, @PathParam("soyisim") String sirname,
			@FormParam("yas") int age, @FormParam("cins") String gender) {
		return "Merhaba Dünya v6 " + name + " " + sirname + " " + age + " " + gender;
	}

	@POST
	@Path("/v7")
	public String hello7(@Valid Employee emp) {
		empDAO.insert(emp);
		return "Merhaba Dünya v7 " + emp.getName() + " " + emp.getSirname() + " " + emp.getAge() + " "
				+ emp.getGender();
	}

	@POST
	@Path("/v8")
	@Consumes(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces(value = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Employee hello8(Employee emp) {
		emp.setName("Test için deðiþtirildi");
		return emp;
	}
	@GET
	@Path("/v9/{isim}")
	@Consumes(value = { MediaType.APPLICATION_JSON})
	@Produces(value = { MediaType.APPLICATION_JSON})
	public List<Employee> hello9(@PathParam("isim") String name) {
		return empDAO.findEmployeeByName(name);
	}

	
}
