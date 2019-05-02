package com.teb.ee.cdi;

import java.io.Serializable;

public class MyImpExecutor6 implements IExecutor,Serializable {
	
	private String prefix;
	
	public MyImpExecutor6(String str) {
		this.prefix = str;
	}
	
	@Override
	public String execute(String str) {
		return prefix  + " " + str;
	}

}
