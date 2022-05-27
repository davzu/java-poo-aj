package com.arquitecturajava.ejemplo004;

public class SuperBrazo implements Girable, Rotable {

	@Override
	public void rotar() {
		System.out.println("El super brazo gira");
	}

	@Override
	public void girar() {
		System.out.println("El super brazo rota");
	}

}
