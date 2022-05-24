package com.arquitecturajava.ejemplo003;

public class Persona {

	private String nombre;
	
	public void andar() {
		System.out.println(getNombre() + " camina a 5 Km/h");
	}
	
	public void imprimeTextoAndar() {
		System.out.println(getNombre() + " camina a");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
}
