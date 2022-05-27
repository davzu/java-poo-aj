package com.arquitecturajava.ejemplo002;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {		
		try {
			Servicio.prueba();
		} catch (Exception e) {
			System.out.println("Ha llegado un error al programa principal: " + e.getMessage());
			System.out.println("Ha llegado un error al programa principal: " + e.getCause().getMessage());
//			JOptionPane.showMessageDialog(null, "Ha llegado un error al programa principal: " + e.getMessage());
		}
	}

}
