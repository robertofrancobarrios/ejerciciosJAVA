package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alumnosAprobados = 0, alumnosCondicionados = 0, alumnosSuspensos = 0;
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("Introduce la nota del alumno " + i + ": ");
			int nota = sc.nextInt();
	
			
			if (nota > 4) {
				alumnosAprobados ++;
								
			} else if (nota == 4) {
				alumnosCondicionados ++;
				
			} else {
				alumnosSuspensos ++;
				
			}
		}
		System.out.println("Cantidad de alumnos aprobados: " + alumnosAprobados);
		System.out.println("Cantidad de alumnos condicionados: " + alumnosCondicionados);
		System.out.println("Cantidad de alumnos suspensos: " + alumnosSuspensos);
		
			
		}

	}


