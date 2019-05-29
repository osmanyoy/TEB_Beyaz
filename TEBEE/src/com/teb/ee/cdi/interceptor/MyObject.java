package com.teb.ee.cdi.interceptor;

import javax.inject.Named;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@Named
public class MyObject {

	@LogInterceptor
	public String hello() {
		return "hello world";
	}
	
	@Transactional(value = TxType.REQUIRES_NEW)
	public void testTrans() {
		
	}
	
}
