package com.arquitecturajava.ejemplo004;

public class AdaptadorBrazoAcero implements Girable {
	
	private Rotable brazoAcero;

	public AdaptadorBrazoAcero(Rotable brazoAcero) {
		super();
		this.brazoAcero = brazoAcero;
	}
	
	@Override
	public void girar() {
		brazoAcero.rotar();
	}


	public Rotable getBrazoAcero() {
		return brazoAcero;
	}

	public void setBrazoAcero(Rotable brazoAcero) {
		this.brazoAcero = brazoAcero;
	}
	

}
