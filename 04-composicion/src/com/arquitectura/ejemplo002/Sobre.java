package com.arquitectura.ejemplo002;

public class Sobre {

	private String color;
	private Galleta galleta;	

	public Sobre(String color, String sabor, double precio) {
		super();
		this.color = color;
		this.galleta = new Galleta(sabor, precio);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrecio() {
		// Uso delegacion
		// 0.1 precio del sobre
		return 0.1 + galleta.getPrecio();
	}

	public String getSabor() {
		return galleta.getSabor();
	}

	public void setSabor(String sabor) {
		galleta.setSabor(sabor);
	}
	
	
	
}
