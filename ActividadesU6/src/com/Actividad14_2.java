package com;

import java.util.Scanner;

public class Actividad14_2 {
	// Función para generar anagramas
	public static String generarAnagrama (String texto) {
		char [] caracteres = texto.toCharArray();
		
		// Mezclar manualmente con bucle
		
		for (int i = caracteres.length -1; i > 0; i--) {
			int j = (int) (Math.random() * (i+1)); // índice aleatorio entre 0 e i
			
			// Intercambiar posiciones
			
			char temp = caracteres[i];
			caracteres[i] = caracteres[j];
			caracteres[j] = temp;
			
		}
		
		return new String(caracteres);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jugador 1, introduce una palabra o frase (no puede ser vacía): ");
		String input = sc.nextLine().trim();
		
		while (input.isEmpty()) {
			System.out.println("La respuesta está vacía, por favor, ingresa una palabra o frase de nuevo");
			input = sc.nextLine().trim();
		}
		
		// Generar anagrama aleatorio
		
		String anagrama = generarAnagrama(input);
		
		// Mostrar el anagrama al jugador 2
		
		System.out.println("El anagrama generado es: " + anagrama);
			
		// Jugador 2 intenta adivinar
		
		System.out.println("Jugador 2, intenta adivinar la palabra original: ");
		String intento = sc.nextLine().trim();
		
		// Verificamos si el intento es correcto
		
		if (intento.equalsIgnoreCase(input)) {
			System.out.println("Enhorabuena! Has acertado");
		} else {
			System.out.println("No has acertado. La palabra correcta era: " + input);
		}
	}
}
