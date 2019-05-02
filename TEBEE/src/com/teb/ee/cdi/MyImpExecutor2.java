package com.teb.ee.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Named;

@Named("abc")
@Default
public class MyImpExecutor2 implements IExecutor,Serializable {

	@Override
	public String execute(String str) {
		return "Mayýn " + str;
	}

}
