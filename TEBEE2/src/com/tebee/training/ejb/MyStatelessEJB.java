package com.tebee.training.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class MyStatelessEJB {

    public MyStatelessEJB() {
    }
    
    public int calc(int a, int b) {
    	return a+b;
    }

}
