package com.arquitecturajava.ejemplo007;

public class Principal {

	public static void main(String[] args) {
		Coche coche = new Coche("Citroen", "C3");
		
		System.out.println(coche.getMarca());
		System.out.println(coche.getModelo());
		
		Coche coche2 = new Coche();
		
		System.out.println(coche2.getMarca());
		System.out.println(coche2.getModelo());
	}

}
