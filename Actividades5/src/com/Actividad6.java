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
		
		System.out.println("Introduce la puntuación de 5 programadores:");
		for (int i = 0; i<5; i++) {
			System.out.println("Puntuación del programador " + (i+1) + ": ");
			puntos[i]=sc.nextInt();
			
			
		}
		
		// Reordenar puntos
		
		Arrays.sort(puntos);
		System.out.println("Puntuación de los 5 programadores: ");
		mostrarPuntuaciones(puntos);
		
		
		
		
		
	}
}
