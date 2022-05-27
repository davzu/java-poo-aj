package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Pedro");

		if (persona != null) {
			System.out.println(persona.getNombre());
		}

	}

}
