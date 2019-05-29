package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Any;
import javax.inject.Named;

@Named("def")
public class ProcessImpl3 implements IProcess,Serializable {

	@Override
	public String processString(String str) {
		return "Hello 3 " + str;
	}

}
