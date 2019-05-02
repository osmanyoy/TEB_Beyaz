package com.teb.ee.servlet;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Listener
 *
 */
@WebListener
public class Listener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Listener() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
    	System.out.println("Session created");
    }

}
