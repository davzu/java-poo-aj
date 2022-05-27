package com.arquitecturajava.ejemplo002;

public class Robot {

	private Brazo brazo;
	
	public void girarBrazo() {
		brazo.girar();
	}

	public Brazo getBrazo() {
		return brazo;
	}

	public void setBrazo(Brazo brazo) {
		this.brazo = brazo;
	}

}
