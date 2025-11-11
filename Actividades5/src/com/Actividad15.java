package com;

import java.util.Scanner;

public class Actividad15 {
	public static int rellenaPares(int[] tabla) {
		Scanner sc = new Scanner(System.in);
		int contadorImpares = 0;
		int indice = 0;
		
		// Leer números hasta que el arreglo esté lleno
		
		while (indice < tabla.length) {
			System.out.println("Introduce un número: ");
			int numero = sc.nextInt();
			
			// Si el número es par se añade al arreglo
			
			if (numero %2 == 0) {
				tabla[indice] = numero;
				indice++;
				
			} else { // De lo contrario se añadirá al contador de impares
				contadorImpares++;
			}
			
		}
		
		return contadorImpares;
		
	}
	
	public static void main(String[] args) {
		int [] tabla = new int[5];
		
		// Llamar a la función rellenaPares
		
		int imparesOmitidos = rellenaPares(tabla);
		
		// Mostrar contenido del arreglo
		
		System.out.println("El contenido del arreglo es: ");
		for (int num : tabla) {
			System.out.println(num + " ");
		}
		
		System.out.println(); // Salto de línea
		
		// Mostrar la cantidad de impares omitidos
		
		System.out.println("Los impares omitidos son: " + imparesOmitidos);
		
	}
}
