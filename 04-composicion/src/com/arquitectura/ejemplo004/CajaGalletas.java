package com.arquitectura.ejemplo004;

import java.util.ArrayList;

public class CajaGalletas {
	
	private ArrayList<Galleta> galletas;

	public CajaGalletas() {
		galletas = new ArrayList<Galleta>();
	}
	
	public void addGalleta(Galleta galleta) {
		// Delegar en el arraylist para añadir galletas
		galletas.add(galleta);
	}
	
	public int totalGalletas() {
		return galletas.size();
	}
	
	public void addGalleta(String sabor, int precio) {
		galletas.add(new Galleta(sabor, precio));
	}

	public double precioTotal() {
		double total = 0;
		
		for(Galleta galleta : galletas) {
			total += galleta.getPrecio();
		}
		
		return total + 1;
	}
	
	
	
	public ArrayList<Galleta> getGalletas() {
		return galletas;
	}

	public void setGalletas(ArrayList<Galleta> galletas) {
		this.galletas = galletas;
	}

}
