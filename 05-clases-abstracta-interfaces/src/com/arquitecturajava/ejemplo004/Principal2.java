package com.arquitecturajava.ejemplo004;

public class Principal2 {

	public static void main(String[] args) {
		Girable brazo = new BrazoNormal();
		Rotable brazoAcero = new BrazoAcero();
		RobotPro robotPro = new RobotPro();
		
//		robotPro.setBrazoPro(brazoAcero);
//		robotPro.rotarBrazoPro();
		
		robotPro.setBrazo(new SuperBrazo());
		robotPro.setBrazoPro(new SuperBrazo());
		
		robotPro.girarBrazo();
		robotPro.rotarBrazoPro();

	}

}
