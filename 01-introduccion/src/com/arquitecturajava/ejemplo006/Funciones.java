package com.arquitecturajava.ejemplo006;

import java.util.Iterator;

public class Funciones {

	public static void main(String[] args) {
		holas();
		adios();
		holas();
	}
	
	private static void holas() {
//		System.out.println("Hola");
//		System.out.println("Hola");
//		System.out.println("Hola");
//		System.out.println("Hola");
		mensaje("Holas", 4);
	}
	
	private static void adios() {
//		System.out.println("Adiós");
//		System.out.println("Adiós");
//		System.out.println("Adiós");
//		System.out.println("Adiós");
		mensaje("Adiós", 4);
	}
	
	public static void mensaje(String mensaje, int repeticiones) {
		for (int i = 0; i < repeticiones; i++) {
			System.out.println(mensaje);
		}
	}
	

}
