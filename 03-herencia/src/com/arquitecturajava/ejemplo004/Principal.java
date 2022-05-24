package com.arquitecturajava.ejemplo004;

public class Principal {
	
	public static void main(String[] args) {
		Persona persona = new Persona("Pedro");
//		persona.setNombre("Pedro");
		
		persona.andar();
		
		Deportista deportista = new Deportista("Carlos");
		deportista.andar();
	}

}
