package com.teb.ee.ejb;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class MyStatefulEJB
 */
@Stateful
@LocalBean
public class MyStatefulEJB implements Serializable {

	private static final long serialVersionUID = 5752569713225117591L;

	@EJB
	private MyStatefulEJB2 ejb2;
	
	private String string;

	private Integer value;
    
	public MyStatefulEJB() {
	}
	
	@PostConstruct
	public void xyz() {
		value = ejb2.getValue();
	}

	@PreDestroy
	public void fgh() {
		value = ejb2.getValue();
	}

	@Remove
	public void abc() {
		
	}
    
	@PrePassivate
	public void sdf() {
		
	}

	@PostActivate
	public void jkl() {
		
	}

}
