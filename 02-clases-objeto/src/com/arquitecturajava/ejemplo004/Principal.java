package com.arquitecturajava.ejemplo004;

public class Principal {
	
	public static void main(String[] args) {
		Coche coche = new Coche("Toyota", "Yaris");
		
		System.out.println(coche.getMarca());
		System.out.println(coche.getModelo());

		Coche coche1 = new Coche("Corolla");
		
		System.out.println(coche1.getMarca());
		System.out.println(coche1.getModelo());
	}

}
