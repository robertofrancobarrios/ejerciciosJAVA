package com.programacion.EJ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
	
	private String nombre;
	private double nota;
	
	public Alumno(String nombre, double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}

	public static void main(String[] args) {
		
		List<Alumno> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Alumno a1 = new Alumno("Joselito", 8);
		Alumno a2 = new Alumno("Miguelito", 4);
		Alumno a3 = new Alumno("Ángel", 5);
		Alumno a4 = new Alumno("María", 6);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for(Alumno alum : lista) {
			if (alum.getNota() >= 5) {
				System.out.println(alum);
			}
		}
		
		calcular_media(lista);
		
		
	}

	private static void calcular_media(List<Alumno> lista) {
		
		double suma = 0;
		
		for(Alumno alum : lista) {
			suma += alum.getNota();
		}
		
		double media = (double) suma / lista.size();
		System.out.println("La media es: " + media);

	}
}
