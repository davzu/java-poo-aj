package com.arquitecturajava.ejemplo006;

public class Principal {
	
	public static void main(String[] args) {
		Persona persona = new Deportista("Gema", "Fútbol");
		
		System.out.println(persona.getNombre());
		persona.andar();
		
		Deportista deportista = (Deportista) persona;
	}

}
