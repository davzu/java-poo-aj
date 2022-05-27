package com.arquitectura.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		Persona carlos = new Persona("Carlos");
		Persona gema = new Persona("Gema");
		Persona miguel = new Persona("Miguel");
		
		miguel.addAmigo(gema);
		miguel.addAmigo(carlos);
		
		for(Persona persona : miguel.getAmigos()) {
			System.out.println(persona.getNombre());
		}

	}

}
