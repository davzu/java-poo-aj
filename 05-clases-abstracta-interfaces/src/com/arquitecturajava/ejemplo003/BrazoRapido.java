package com.arquitecturajava.ejemplo003;

public class BrazoRapido extends Brazo implements Girable {

	private String tipoAspa;

	public String getTipoAspa() {
		return tipoAspa;
	}

	public void setTipoAspa(String tipoAspa) {
		this.tipoAspa = tipoAspa;
	}

	@Override
	public void girar() {
		System.out.println("El brazo gira a 50 vueltas/minuto");
	}

}
