package com.tebee.training.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@LogAnnotation
public class MyInterceptor {
	
	@AroundInvoke
	public Object abc(InvocationContext context) {
		try {
			System.out.println("Method : " + context.getMethod().getName() + " çaðrýlýyor");
			Object proceed = context.proceed();
			if (proceed instanceof String) {
				String string = (String) proceed;
				string += " Intercepted.";
				return string;
			}
			return proceed;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
