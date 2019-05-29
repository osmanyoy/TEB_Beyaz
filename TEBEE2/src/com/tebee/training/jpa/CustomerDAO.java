package com.tebee.training.jpa;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Session Bean implementation class CustomerDAO
 */
@Stateless
@LocalBean
public class CustomerDAO {

	@PersistenceContext(unitName = "TEBEE2")
	private EntityManager em;
	    
	public CustomerDAO() {
        // TODO Auto-generated constructor stub
    }
    
    public void insertCustomer(Customer cst) {
    	em.persist(cst);
    }

	public void updateCustomer(Customer customer) {
		Customer mergedCustomer = em.merge(customer);
		
	}

	public List<Customer> getCustomersByName(String name) {
		TypedQuery<Customer> createQuery = em.createQuery("select c from Customer c where c.name=:isim",Customer.class);
		createQuery.setParameter("isim", name);
		return createQuery.getResultList();
	}

	public List<Customer> getCustomersByNameWithNativeSQL(String name) {
		Query createNativeQuery = em.createNativeQuery("select * from Customer c where c.isim=:isim",Customer.class);
		createNativeQuery.setParameter("isim", name);
		return createNativeQuery.getResultList();
	}

}
