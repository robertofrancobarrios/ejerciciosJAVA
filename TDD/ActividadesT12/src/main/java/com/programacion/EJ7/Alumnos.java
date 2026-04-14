package com.programacion.EJ7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.programacion.EJ3.Alumno;

public class Alumnos {
	
	public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", 7.5));
        alumnos.add(new Alumno("Luis", 9.2));
        alumnos.add(new Alumno("Marta", 6.8));
        alumnos.add(new Alumno("Pedro", 8.1));

        // Orden ascendente por nota
        alumnos.sort(Comparator.comparing(Alumno::getNota));

        // Mostrar resultado
        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    }
}