package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.inject.Named;

@Alternative
public class ProcessImpl6 implements IProcess,Serializable {

	@Override
	public String processString(String str) {
		return "Hello 6 " + str;
	}

}
