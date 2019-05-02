package com.teb.ee.jpa;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Session Bean implementation class EmployeeDAO
 */
@Stateless
@LocalBean
public class EmployeeDAO {

	@PersistenceContext(unitName = "TEBEE")
	private EntityManager em;

	public EmployeeDAO() {
	}

	public void insert(Employee emp) {
		em.persist(emp);
	}

	public List<Employee> findEmployeeByName(String name) {
		TypedQuery<Employee> createQuery = em.createQuery("select e from Employee e where e.name= :isim",
				Employee.class);
		createQuery.setParameter("isim", name);
		return createQuery.getResultList();
	}

	public List<Employee> findEmployeeByNameNative(String name) {
		Query createNativeQuery = em.createNativeQuery("select * from calisan c where c.name= :isim",
				Employee.class);
		createNativeQuery.setParameter("isim", name);
		return createNativeQuery.getResultList();
	}

}
