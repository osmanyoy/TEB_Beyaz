package com.teb.ee.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.inject.Named;

@Named("xyz")
@Any
public class MyImpExecutor1 implements IExecutor,Serializable {

	@Override
	public String execute(String str) {
		return "Sayýn " + str;
	}

}
