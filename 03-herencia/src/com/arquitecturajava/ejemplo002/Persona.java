package com.arquitecturajava.ejemplo002;

public class Persona {

	private String nombre;
	
	public void andar() {
		System.out.println(getNombre() + " camina a 5 Km/h");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
