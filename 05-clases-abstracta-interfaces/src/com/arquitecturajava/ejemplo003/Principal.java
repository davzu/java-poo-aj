package com.arquitecturajava.ejemplo003;

public class Principal {

	public static void main(String[] args) {
		Girable brazo = new BrazoNormal();
		Girable brazo2 = new BrazoRapido();
		Girable coctelera = new Coctelera();

		Robot robot = new Robot();
		robot.setBrazo(brazo);
		robot.girarBrazo();

		robot.setBrazo(brazo2);
		robot.girarBrazo();

		robot.setBrazo(coctelera);
		robot.girarBrazo();

	}

}
