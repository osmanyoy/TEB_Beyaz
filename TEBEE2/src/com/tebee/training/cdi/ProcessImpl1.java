package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Default;
import javax.inject.Named;

@Named("xyz")
public class ProcessImpl1 implements IProcess,Serializable {

	@Override
	public String processString(String str) {
		return "Hello " + str;
	}

}
