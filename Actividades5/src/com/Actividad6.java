package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {
	public static void mostrarPuntuaciones(int[] puntuaciones) {
		for (int i=0; i<puntuaciones.length;i++) {
			System.out.println("Puntuación " + (i + 1) + ": " + puntuaciones[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Inicializo array de puntuaciones para 5 programadores
		
		int[] puntos = new int[5];
		
		// Para leer las puntuaciones de los 5 programadores
		
		System.out.println("Introduce la puntuación de 5 programadores");
		for (int i = 0; i<5; i++) {
			System.out.println("Puntuación del programador " + (i+1) + ": ");
			puntos[i]=sc.nextInt();
			
			
		}
		
		// Reordenar puntos
		
		Arrays.sort(puntos);
		System.out.println("Puntuación de los 5 programadores: ");
		mostrarPuntuaciones(puntos);
		
		// Añadir 3 programadores de exhibición, con una puntuación igual, usando -1 para indicar que no hay más
		
		System.out.println("A continuación, se podrá introducir la puntuación de hasta 3 programadores de exhibición ");
		int contadorExhibicion = 0;
		
		while (contadorExhibicion < 3) {
			System.out.println("Introduce la puntuación del programador de exhibición (o -1 para terminar)");
			int puntuacionExhibicion = sc.nextInt();
			
			if (puntuacionExhibicion == -1) {
				break;
				
				
			}
			
			// Amplío el array para añadir la puntuación
			
			puntos = Arrays.copyOf(puntos, puntos.length + 1);
			puntos [puntos.length - 1] = puntuacionExhibicion;
			
			contadorExhibicion++;
			
		}
		
		// Ordenar el array nuevamente
		
		Arrays.sort(puntos);
		
		// Mostrar las puntuaciones finales
		
		System.out.println("\nPuntuaciones finales: ");
		for (int puntuacion : puntos) {
			System.out.println(puntuacion);
		}
	}
}
