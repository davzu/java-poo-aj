package com.arquitecturajava.ejemplo005;

public class Principal {
	String a;
	public static void main(String[] args) {
		Persona persona = new Deportista("Pedro");		
		Persona persona2 = new Ingeniero("Ana");		
		Deportista deportista = new Deportista("Ángel");
		
		iniciarCamino(persona);
		iniciarCamino(persona2);
		iniciarCamino(deportista);
	}
	
	public static void iniciarCamino(Persona d) {
		d.andar();
	}

}
