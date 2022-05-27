package com.arquitectura.ejemplo004;

public class Principal {

	public static void main(String[] args) {
		CajaGalletas miCaja = new CajaGalletas();
		miCaja.addGalleta("Chocolate", 1);
		miCaja.addGalleta("Chocolate", 1);
		miCaja.addGalleta("Chocolate", 1);
		miCaja.addGalleta("Chocolate", 1);

		System.out.println(miCaja.totalGalletas());
		System.out.println(miCaja.precioTotal());
	}

}
