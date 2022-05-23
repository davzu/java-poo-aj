package com.arquitecturajava.ejemplo007;

public class Coche {

	private String marca;
	private String modelo;

	public Coche() {
		this("Toyota", "Yaris");
	}

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
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

}
