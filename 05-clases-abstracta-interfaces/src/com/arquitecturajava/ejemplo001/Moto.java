package com.arquitecturajava.ejemplo001;

public class Moto extends Vehiculo {

	public Moto(String marca) {
		super(marca);
	}
	
	@Override
	public void acelerar() {
		System.out.println("La moto acelera");
	}

}
