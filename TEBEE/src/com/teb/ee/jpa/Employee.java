package com.teb.ee.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "calisan")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	
	@Id
	@GeneratedValue
	private long empId;
	
	@Size(min = 3,max = 5)
	@Column(name="isim",length = 50)
	private String name;
	@XmlElement(name = "soyisim")
	private String sirname;
	@Max(value = 120,message = "120 den küçük olmalý")
	@Min(18)
	private int age;
	private String gender;
	
	@OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private  Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSirname() {
		return sirname;
	}
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
