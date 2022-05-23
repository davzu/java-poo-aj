package com.arquitecturajava.ejemplo008;

public class Principal {

	public static void main(String[] args) {
		System.out.println(Circulo.area(2));
		
		Circulo circulo = new Circulo(3);
		System.out.println(circulo.area());

	}

}
