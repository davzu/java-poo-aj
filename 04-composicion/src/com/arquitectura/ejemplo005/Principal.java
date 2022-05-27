package com.arquitectura.ejemplo005;

public class Principal {

	public static void main(String[] args) {
		Casa casa = new Casa("Santander");
		
		Persona persona = new Persona("Juan");
		Persona persona2 = new Persona("Ana");
		
		casa.add(persona);
		casa.add(persona2);
		System.out.println(casa.contains(new Persona("Ana")));
		System.out.println(casa.totalPersonas());

		persona.add(casa);
		System.out.println(persona.contains(casa)); // true
		System.out.println(persona.contains(new Casa("Santander"))); // false porque no se sobreescribio los metodos equals y hashcode
		
	}

}
