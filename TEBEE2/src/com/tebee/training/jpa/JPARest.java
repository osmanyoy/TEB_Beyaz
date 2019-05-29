package com.tebee.training.jpa;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/jpa")
public class JPARest {

	@EJB
	private CustomerDAO custDAO;

	@POST
	@Path("/persist")
	public String writeCustomerToDB(Customer customer) {
		custDAO.insertCustomer(customer);
		return "OK";
	}
	
	@POST
	@Path("/update")
	public String updateCustomer(Customer customer) {
		custDAO.updateCustomer(customer);
		return "OK";
	}
	
	@GET
	@Path("/get/{name}")
	public String getCustomers(String name) {
		custDAO.getCustomersByName(name);
		return "OK";
	}
	
}
