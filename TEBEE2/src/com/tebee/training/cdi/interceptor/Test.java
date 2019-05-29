package com.tebee.training.cdi.interceptor;

public class Test {
	
	@LogAnnotation
	public String helloWorld() {
		return "Hello world";
	}
	
}
