package com.tebee.training.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CustomerDetail {
	
	@Id
	@GeneratedValue
	private long cdId;
	
	private String value1;
	private String value2;
	
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	public String getValue2() {
		return value2;
	}
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	public long getCdId() {
		return cdId;
	}
	public void setCdId(long cdId) {
		this.cdId = cdId;
	}

	
}
