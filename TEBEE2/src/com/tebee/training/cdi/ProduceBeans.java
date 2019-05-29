package com.tebee.training.cdi;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

public class ProduceBeans {
	
	@Produces
	@Named("abc")
	@RequestScoped
	public IProcess createABCBean() {
		return new ProcessImpl2("Test ");
	}
	
}
