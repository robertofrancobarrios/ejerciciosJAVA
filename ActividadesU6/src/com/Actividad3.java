package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// StringBuilder para acumular las palabras de la frase
		
		StringBuilder frase = new StringBuilder();
		
		// Para ir leyendo las palabras una por una
		
		String palabra = ""; // Declarar la variable
		do {
			System.out.println("Introduce una palabra (escribe 'fin' para salir)");
			palabra = sc.nextLine();
			
			// Para asegurarnos de que 'fin' se puede escribir tanto en mayúsculas o minúsculas
			
			if(palabra.equalsIgnoreCase("fin")) {
				break;
			}
			
			if (frase.length() > 0) {
				frase.append(" "); // Añadir espacio si ya hay algo en la frase
			}
			
			frase.append(palabra);
			
			
		} while (!palabra.equalsIgnoreCase("fin"));
		
		// Mostrar la frase completa
		
		System.out.println("La frase completa es: " + frase);	

	}
}