package com.teb.ee.ejb;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class MySingletonEJB
 */
@Singleton
@LocalBean
public class MySingletonEJB {

    public MySingletonEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public String randomStr() {
    	SecureRandom random = new SecureRandom();
    	return "sayi : " + random.nextInt();
    }
    
    @Asynchronous
    public Future<String> asyncTest() {
    	return new AsyncResult<String>("test return") ;
    }
    
    @Schedule(hour = "*",minute = "*",second = "30",persistent = false)
    public void scMethod() {
    	System.out.println("Çalýþtým");
    }

}
