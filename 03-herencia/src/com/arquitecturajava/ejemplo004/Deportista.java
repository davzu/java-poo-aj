package com.arquitecturajava.ejemplo004;

public class Deportista extends Persona {

	private String deporte;

	public Deportista(String nombre) {
		super(nombre);
	}

	@Override
	public void andar() {
		System.out.println(getNombre() + " camina a 10 Km/h");
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
}
