package com.arquitecturajava.ejemplo001;

public class Rectangulo {
	
	int lado1;
	int lado2;
	
	public double area() {
		return lado1 * lado2;
	}
	
	public double perimetro() {
		return lado1 * 2 + lado2 * 2;
	}

}
