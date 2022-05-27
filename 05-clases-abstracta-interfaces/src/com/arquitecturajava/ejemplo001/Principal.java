package com.arquitecturajava.ejemplo001;

public class Principal {

	public static void main(String[] args) {
		Moto moto = new Moto("Ducati");
		Coche coche = new Coche("Toyota");
		Vehiculo camion = new Camion("Volvo");
		
		System.out.println(moto.getMarca());
		System.out.println(coche.getMarca());
		
		
		acelerarVehiculo(moto);
		
		camion.pagarImpuesto();
	}
	
	public static void acelerarVehiculo(Vehiculo v) {
		v.acelerar();
	}

}
