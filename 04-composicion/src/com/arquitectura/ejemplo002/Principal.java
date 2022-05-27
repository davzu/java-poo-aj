package com.arquitectura.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		// Emeplo relacion 1 a 1
		
//		Galleta galleta1 = new Galleta("Chocolate", 1);
//		System.out.println(galleta1.getSabor());

		Sobre sobre1 = new Sobre("Azul", "Chocolate", 1);
		System.out.println(sobre1.getColor());
		System.out.println(sobre1.getSabor());
		
		System.out.println(sobre1.getPrecio());

	}

}
