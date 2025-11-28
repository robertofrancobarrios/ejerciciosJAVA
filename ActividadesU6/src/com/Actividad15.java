package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Actividad15 {
	// Función para generar anagrama
	public static String generarAnagrama(String texto) {
		
		// Convertir el texto a una lista de caracteres
		ArrayList<Character> caracteres = new ArrayList<>();
		for (int i=0; i < texto.length(); i++) {
			caracteres.add(texto.charAt(i));
		}
		
		// Mezclar aleatoriamente los caracteres
		
		Collections.shuffle(caracteres);
		
		// Construir el nuevo anagrama a partir de los caracteres mezclados
		
		StringBuilder anagrama = new StringBuilder();
		for (Character c : caracteres) {
			anagrama.append(c);
		}
		
		return anagrama.toString();
	}
	
	public static int contarCoincidencias (String original, String intento) {
		int coincidencias = 0;
		int longitud = Math.min(original.length(), intento.length());
		
		// Comparar los caracteres de la palabra original con el intento
		for (int i=0; i<longitud; i++) {
			if (original.charAt(i) == intento.charAt(i) ) {
				coincidencias ++;
			}
		}
		
		return coincidencias;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Jugador 1 ingresa la palabra o frase
		System.out.println("Jugador 1, introduce una palabra o frase (no puede ser vacía): ");
		String input = sc.nextLine().trim();
		
		while (input.isEmpty()) {
			System.out.println("La respuesta está vacía, por favor, ingresa una palabra o frase de nuevo");
			input = sc.nextLine().trim();
		}
		
		// Generamos un anagrama aleatorio
		
		String anagrama = generarAnagrama(input);
		String intento;
		
		// Mostrar el anagrama a jugador 2
		System.out.println("El anagrama es: " + anagrama);
		
	
		do {
			// Jugador 2 intenta adivinar
			
			System.out.println("\nJugador 2, intenta adivinar cuál es la palabra original: ");
			intento = sc.nextLine().trim();
			
			// Para verificar cuántas letras coinciden
			
			int coincidencias = contarCoincidencias (input, intento);
			System.out.println("Coincidencias: " + coincidencias + " letra(s) correcta(s)");
			
		} while (!intento.equalsIgnoreCase(input)); // Mientras el intento no sea igual que la palabra original
		
		// Verificamos si el intento es correcto
		
		System.out.println("¡Correcto! Has acertado la palabra, Jugador 2");
		
		
	}
}