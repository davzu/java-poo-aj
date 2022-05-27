package com.arquitecturajava.ejemplo002;

public class Principal {

	public static void main(String[] args) {
		Brazo brazo = new BrazoNormal();
		Brazo brazo2 = new BrazoRapido();
		Brazo coctelera = new Coctelera();
		
		Robot robot = new Robot();
		robot.setBrazo(brazo);
		robot.girarBrazo();
		
		robot.setBrazo(brazo2);
		robot.girarBrazo();
		
		robot.setBrazo(coctelera);
		robot.girarBrazo();
		
	}

}
