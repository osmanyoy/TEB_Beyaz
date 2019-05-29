package com.tebee.training.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Any;
import javax.inject.Named;

@MyQualifier
public class ProcessImpl4 implements IProcess,Serializable {

	@Override
	public String processString(String str) {
		return "Hello 4 " + str;
	}

}
