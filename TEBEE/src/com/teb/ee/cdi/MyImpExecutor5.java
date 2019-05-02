package com.teb.ee.cdi;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.inject.Named;

@Alternative
public class MyImpExecutor5 implements IExecutor,Serializable {

	@Override
	public String execute(String str) {
		return "Xayýn " + str;
	}

}
