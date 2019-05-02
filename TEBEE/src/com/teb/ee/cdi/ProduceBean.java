package com.teb.ee.cdi;

import java.security.SecureRandom;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class ProduceBean {
	
	@Produces
	@Named("1234")
	public IExecutor createExecutor() {
		return new MyImpExecutor6("Test");
	}
	

	@Produces
	@RequestScoped
	@Named("osman")
	public IExecutor createRandom() {
		SecureRandom random = new SecureRandom();
		int nextInt = random.nextInt(6);
		switch (nextInt) {
		case 0:
			return new MyImpExecutor1();
		case 1:
			return new MyImpExecutor2();
		case 2:
			return new MyImpExecutor3();
		case 3:
			return new MyImpExecutor4();
		case 4:
			return new MyImpExecutor5();
		case 5:
			return new MyImpExecutor6("Mest");

		default:
			return new MyImpExecutor1();
		}
	}

}
