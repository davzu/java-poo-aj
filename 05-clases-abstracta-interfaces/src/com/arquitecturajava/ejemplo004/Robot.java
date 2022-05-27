package com.arquitecturajava.ejemplo004;

public class Robot {

	private Girable brazo;
	
	public void girarBrazo() {
		brazo.girar();
	}

	public Girable getBrazo() {
		return brazo;
	}

	public void setBrazo(Girable brazo) {
		this.brazo = brazo;
	}

}
