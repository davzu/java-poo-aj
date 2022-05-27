package com.arquitectura.ejemplo005;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
	
	private String nombre;
	private ArrayList<Casa> casas;
		
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
		this.casas = new ArrayList<Casa>();
	}	
	
	public boolean contains(Object o) {
		return casas.contains(o);
	}

	public boolean add(Casa e) {
		return casas.add(e);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre);
	}
	

}
