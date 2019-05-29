package com.tebee.training.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StudentCalc {
	private String name;
	private double calcValue;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalcValue() {
		return calcValue;
	}
	public void setCalcValue(double calcValue) {
		this.calcValue = calcValue;
	}
	
	
}
