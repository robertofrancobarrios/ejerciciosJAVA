package com;

import java.util.Scanner;

public class Actividad12 {
	public static boolean sonAnagramas (String palabra1, String palabra2) {
		
		
		// Normalizar las palabras
		
		palabra1 = palabra1.toLowerCase();
		palabra2 = palabra2.toLowerCase();
		
		// Si no tienen la misma longitud, no pueden ser anagramas
		
		if (palabra1.length() != palabra2.length()) {
			return false;
		}
		
		// Convertir las palabras a arrays de caracteres y ordenarlos
		
		char[] array1 = palabra1.toCharArray();
		char[] array2 = palabra2.toCharArray();
		
		// Ordenar los arrays
		
		java.util.Arrays.sort(array1);
		java.util.Arrays.sort(array2);
		
		// Comparar los arrays ordenados
		
		return java.util.Arrays.equals(array1, array2);
		
	}
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitar al usuario dos palabras
		
		System.out.println("Inserta la primera palabra: ");
		String palabra1 = sc.nextLine();
		
		System.out.println("Inserta la segunda palabra: ");
		String palabra2 = sc.nextLine();
		
		// Para verificar si las dos palabras son anagramas
		
		if (sonAnagramas (palabra1, palabra2) ) {
			System.out.println("Sí, las palabras son anagramas.");
		} else {
			System.out.println("No, las palabras no son anagramas.");
		}
	}
}
