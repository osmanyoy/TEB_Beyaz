package com.teb.ee.ws;

import javax.jws.WebService;

import com.teb.ee.jpa.Employee;

@WebService
public class EmployeeWS {

	public Employee hello8(Employee emp) {
		emp.setName("Test için deðiþtirildi");
		return emp;
	}

}
