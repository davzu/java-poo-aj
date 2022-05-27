package com.arquitectura.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		Persona persona = new Persona("Juan");
		Persona persona2 = new Persona("Juan");
		
		System.out.println(persona.hashCode());
		System.out.println(persona2.hashCode());
		
		
	}

}
