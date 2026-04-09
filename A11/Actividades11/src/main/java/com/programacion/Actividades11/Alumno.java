package com.programacion.Actividades11;

import java.io.Serializable;

public class Alumno implements Serializable{
	int id;
	String nombre;
	double nota;
	public boolean activo;
	
	public Alumno (int id, String nombre, double nota) {
		this.id=id;
		this.nombre=nombre;
		this.nota=nota;
		boolean activo = true;
	}
}
