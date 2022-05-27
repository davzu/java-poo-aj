package com.arquitecturajava.ejemplo004;

public class BrazoNormal extends Brazo implements Girable {

	@Override
	public void girar() {
		System.out.println("El brazo gira a 20 vueltas/minuto");
	}

}
