package com.arquitectura.ejemplo003;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> miLista = new ArrayList<String>();
		miLista.add("Hola");
		miLista.add("qué");
		miLista.add("tal");
		miLista.add("estás");

		for (int i = 0; i < miLista.size(); i++) {
			System.out.println(miLista.get(i));
		}

		System.out.println("=======================");
		for (String cadena : miLista) {
			System.out.println(cadena);
		}
		
		boolean result = miLista.contains("Hola");
		System.out.println(result);
		
		miLista.clear();
		miLista.add("tal");
		
		System.out.println("=======================");
		for (String cadena : miLista) {
			System.out.println(cadena);
		}
		
		miLista.remove("tal");
		
		System.out.println("=======================");
		for (String cadena : miLista) {
			System.out.println(cadena);
		}

	}

}
