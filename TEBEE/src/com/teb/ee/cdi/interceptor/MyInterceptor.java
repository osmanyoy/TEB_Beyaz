package com.teb.ee.cdi.interceptor;

import java.lang.reflect.Method;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@LogInterceptor
public class MyInterceptor {
	
	@AroundInvoke
	public Object abc(InvocationContext context) {
		Method method = context.getMethod();
		System.out.println("Metod : " + method.getName() + " çaðrýldý.");
		Object result = null;
		try {
			result =context.proceed();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result instanceof String) {
			String string = (String) result;
			string += " Intercepted";
			result = string;
		}
		return result;
	}

}
