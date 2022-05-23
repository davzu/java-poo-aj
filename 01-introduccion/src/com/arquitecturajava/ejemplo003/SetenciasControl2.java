package com.arquitecturajava.ejemplo003;

public class SetenciasControl2 {

	public static void main(String[] args) {
		int numero = 10;
		
		if(numero >= 5 && numero < 7) {
			System.out.println("Has aprobado");
		}
		
		if(numero == 0 || numero == 10) {
			System.out.println("Estás en el extremo de la nota");
		}
	}

}
