package com;

import java.util.Random;
import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		// Tamaño de la combinación
		
		System.out.println("Introduce la longitud de la combinación: ");
		int longitud = sc.nextInt();
		
		// Crear combinación secreta
		
		int[] combinacion = new int [longitud];
		for (int i = 0; i < longitud; i++) {
			combinacion [i] = rand.nextInt(5) + 1;
		}
		
		int fallos;
		int [] intento = new int[longitud];
		
		System.out.println("\nEmpieza el juego");
		
		do {
			fallos = 0;
			
			// Pedir intento al usuario para cada dígito
			for (int i=0; i<longitud; i++) {
				System.out.println("Introduce el dígito: " + (i + 1) + ": ");
				intento[i]=sc.nextInt();
				
				// Comparación con la combinación secreta
				
				if (intento[i] < combinacion[i]) {
					System.out.println("Mayor");
					fallos++;
				} else if (intento[i] > combinacion [i]) {
					System.out.println("Menor");
					fallos++;
				} else {
					System.out.println("Igual");
					
				}
			}	
			
			if (fallos != 0) {
				System.out.println("\nAún no has acertado todos los dígitos. Intenta de nuevo.\n");
			}
				
			
		} while (fallos != 0);
		
		System.out.println("\nFelicidades, has acertado la combinación.");
		
	}
}
