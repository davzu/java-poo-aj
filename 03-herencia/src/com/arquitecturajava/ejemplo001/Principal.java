package com.arquitecturajava.ejemplo001;

public class Principal {
	
	public static void main(String[] args) {
		Deportista d1 = new Deportista();
		d1.setNombre("Pedro");
		d1.setDeporte("Tenis");
		
		System.out.println(d1.getNombre());
		System.out.println(d1.getDeporte());
	}

}
