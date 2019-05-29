package com.tebee.training.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class MySingletonEJB {
	
	
	@Lock(LockType.WRITE)
	public void test1() {
		
	}
	
	@Lock(LockType.READ)
	public void test2() {
		
	}

	@Lock(LockType.READ)
	public void test3() {
		
	}

}
