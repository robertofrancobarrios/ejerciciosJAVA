package com;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min, max, numero;
		// ¿Cual es el valor mínimo y máximo?
		
		System.out.println("Inserte el valor mínimo: ");
		min = sc.nextInt();
		
		System.out.println("Inserte el valor máximo: ");
		max = sc.nextInt();
		
		// Comprobar que el valor mínimo sea menor que el valor máximo
		
		while (min > max) {
			System.out.println("El valor mínimo no puede ser mayor que el valor máximo.");
			System.out.println("Inserte de nuevo el valor mínimo: ");
			min = sc.nextInt();
			System.out.println("Inserte de nuevo el valor máximo: ");
			max = sc.nextInt();
			
		}
		
		// Solicitamos un número dentro del rango
		
		do {
			System.out.println("Inserte un número dentro del rango (" + min + " - " + max + "): ");
			numero = sc.nextInt();
			
			if (numero < min || numero > max) {
				System.out.println("El número no está dentro del rango, prueba otra vez.");
			}
		} while (numero < min || numero > max);
		
		System.out.println("El número " + numero + " está dentro del rango.");
	}
}
