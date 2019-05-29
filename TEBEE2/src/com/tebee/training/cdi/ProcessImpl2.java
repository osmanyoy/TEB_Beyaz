package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Any;
import javax.inject.Named;

@Named("abc")
public class ProcessImpl2 implements IProcess,Serializable {
	
	private String prefix;
	
	public ProcessImpl2(String prefix) {
		this.prefix = prefix;
	}

	@Override
	public String processString(String str) {
		return prefix + str;
	}

}
