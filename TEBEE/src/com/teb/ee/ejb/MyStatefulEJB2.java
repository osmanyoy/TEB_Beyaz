package com.teb.ee.ejb;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class MyStatefulEJB
 */
@Stateful
@LocalBean
public class MyStatefulEJB2 implements Serializable {

	private static final long serialVersionUID = 5752569713225117591L;

	private Integer value;
    
	public MyStatefulEJB2() {
        // TODO Auto-generated constructor stub
    }

	@Remove
	public void abc() {
		
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
    
}
