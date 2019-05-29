package com.tebee.training.calc;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
public class Calculator implements Serializable {

	private int state = 0;
	
	@Inject
	@Named("op")
	private IOperation opInt;
	
	private int oparation = -1;
	
	public String menu() {
		reset();
		state = 1;
		return "1-Toplama 2-��karma 3-�arpma";
	}

	private void reset() {
		state = 0;
		oparation = -1;
	}

	public String operasyon(int opIndex) {
		if (state != 1) {
			throw new IllegalStateException("�nce men�y� �a��r");
		}
		state = 2;
		oparation = opIndex;
		return "OK";
	}

	public String yap(int value1, int value2) {
		if (state != 2) {
			throw new IllegalStateException("�nce operasyonu �a��r");
		}
		int result = opInt.yap(value1, value2);
		reset();
		return "Sonu� : "  + result;
	}

	public String yap2(int value1, int value2) {
		if (state != 2) {
			throw new IllegalStateException("�nce operasyonu �a��r");
		}
		int result = 0;
		switch (oparation) {
		case 1:
			result = value1+value2;
			break;
		case 2:
			result = value1-value2;
			break;
		case 3:
			result = value1*value2;
			break;

		default:
			throw new IllegalStateException("Yanl�� operasyon");
		}
		reset();
		return "Sonu� : "  + result;
	}

	public int getOparation() {
		return oparation;
	}

	public void setOparation(int oparation) {
		this.oparation = oparation;
	}
	

}
