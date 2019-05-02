package com.teb.ee.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private long addId;
	private String addr;
	private String city;
	
	public long getAddId() {
		return addId;
	}
	public void setAddId(long addId) {
		this.addId = addId;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
