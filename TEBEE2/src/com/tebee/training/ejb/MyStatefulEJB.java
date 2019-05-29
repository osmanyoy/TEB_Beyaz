package com.tebee.training.ejb;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
@LocalBean
public class MyStatefulEJB implements Serializable {
	
	@PrePassivate
	public void ghjk() {
		
	}
	
	@PostActivate
	public void ouyt() {
		
	}
	
	@Remove
	public void hgfd() {
		
	}
	
}
