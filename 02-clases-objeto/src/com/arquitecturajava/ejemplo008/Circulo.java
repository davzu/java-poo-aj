package com.arquitecturajava.ejemplo008;

public class Circulo {
	
	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public static double area(double radio) {
		return 2 * Math.PI * radio;
	}
	
	public double area() {
		return Circulo.area(this.radio);
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}	
	
}
