package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumaEdad = 0, numeroAlumnos = 0, AlumnosMayores = 0;
		int edad;
		
		System.out.println("Introduce las edades de los alumnos (Si introduces un número negativo, el programa terminará");
		
		do {
			System.out.println("Introduce una edad: ");
			edad = sc.nextInt();
			
			if (edad >= 0) { // Si la edad no es negativa, funcionará
				sumaEdad += edad; // Suma la edad al total
				numeroAlumnos++; // Incrementa el contador de alumnos
				
				if (edad >= 18) { // Verificará si el alumno es mayor de edad
					AlumnosMayores++; // Incrementará el contador de alumnos mayores de edad
					
				}
				
			}
		} while (edad >= 0); // Continúa mientras la edad introducida sea positiva ( > 0 )
		
		System.out.println("\n ---- Resultados ---- ");
		
		if (numeroAlumnos > 0) {
			System.out.println("La suma de las edades es: " + sumaEdad);
			System.out.println("El número de alumnos es: " + numeroAlumnos);
			System.out.println("La media de las edades es: " + (double) sumaEdad / numeroAlumnos);
			System.out.println("Cantidad de alumnos mayores de edad: " + AlumnosMayores);
			
		} else {
			System.out.println("No se han introducido edades válidas.");
		}
		
		
	}
	
	
}
