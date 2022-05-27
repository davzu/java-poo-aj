package com.arquitectura.ejemplo001;

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
	
	@Override
	public boolean equals(Object obj) {
		Persona nueva = (Persona) obj;
		return nueva.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		return nombre.hashCode();
	}
	
	
	
}
