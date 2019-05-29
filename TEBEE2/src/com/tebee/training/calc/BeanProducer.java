package com.tebee.training.calc;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class BeanProducer {
	@Produces
	@Named("op")
	@RequestScoped
	public IOperation generateOp(Calculator calculator) {
		switch (calculator.getOparation()) {
		case 1:
			return new Toplama();
		case 2:
			return new Cikartma();
		case 3:
			return new Carpma();
			
		default:
			return null;
		}
	}
	
}
