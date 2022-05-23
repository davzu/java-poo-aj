package com.arquitecturajava.ejemplo006;

public class Coche {

	private String marca;
	private String modelo;
	// variable pertenece a la clase no al objeto
	private static int contador;

	public Coche() {
		this("Toyota", "Yaris");
	}

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		contador++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public static int getContador() {
		return contador;
	}
	
	

}
