package com.arquitecturajava.ejemplo003;

public class SentenciasControl {

	public static void main(String[] args) {
		int numero = 6;
		
		if(numero > 5) {
			System.out.println("Has aprobado");
		} else if(numero == 5) {
			System.out.println("Has aprobado por poco");
		} else {
			if (numero < 2) {
				System.out.println("Has desaprobado de forma exagerada");
			} else {
				System.out.println("Has suspendido");
			}
		}
	}
	
}
