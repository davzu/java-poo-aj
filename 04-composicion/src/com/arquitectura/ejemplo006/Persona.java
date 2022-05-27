package com.arquitectura.ejemplo006;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
	
	private String nombre;
	private ArrayList<Persona> amigos = new ArrayList<Persona>();

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addAmigo(Persona persona) {
		amigos.add(persona);
	}
	
	public void eliminarAmigo(Persona persona) {
		amigos.remove(persona);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getAmigos() {
		return amigos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amigos, nombre);
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
		return Objects.equals(amigos, other.amigos) && Objects.equals(nombre, other.nombre);
	}

}
