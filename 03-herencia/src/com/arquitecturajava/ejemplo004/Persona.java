package com.arquitecturajava.ejemplo004;

public class Persona {

	private String nombre;
		
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

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
