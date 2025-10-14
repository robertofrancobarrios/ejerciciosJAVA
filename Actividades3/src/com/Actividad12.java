package com;

import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int nota;
		boolean haySuspenso = false;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Inserta la calificación del alumno " + i + ":");
			nota = sc.nextInt();
			
			if (nota < 5) {
				System.out.println("El alumno ha suspendido");
				haySuspenso=true;
				
			} else {
				System.out.println("El alumno ha aprobado");
			}
		}
		if (haySuspenso) {
			System.out.println("Hay alumnos suspensos.");
			
		} else {
			System.out.println("Ningún alumno ha suspendido.");
		}
	
	
	
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		do {
			System.out.println("Inserta una calificación del alumno");
			nota = sc.nextInt();
			if (nota < 5) {
				System.out.println("El alumno ha suspendido.");	
			} else {
				System.out.println("El alumno ha aprobado.");
			}
			
			
		} while (nota >= 0 && nota <= 10);
		
	}
}
*/