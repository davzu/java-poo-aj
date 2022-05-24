package com.arquitecturajava.ejemplo002;

public class Principal {
	
	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setNombre("Pedro");
		
		persona.andar();
		
		Deportista deportista = new Deportista();
		deportista.setNombre("Carlos");
		deportista.andar();
	}

}
