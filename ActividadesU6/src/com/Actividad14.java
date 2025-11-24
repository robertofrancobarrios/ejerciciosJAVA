package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Actividad14 {
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
		
		// Mostrar el anagrama al jugador 2
		
		System.out.println("\nEl anagrama generado es: " + anagrama);
		
		// Jugador 2 intenta adivinar
		
		System.out.println("\nJugador 2, intenta adivinar cuál es la palabra original: ");
		String intento = sc.nextLine().trim();
		
		// Verificamos si el intento es correcto
		
		if (intento.equalsIgnoreCase(input)) {
			System.out.println("¡Enhorabuena, has acertado, jugador 2!");
		} else {
			System.out.println("Palabra incorrecta. La palabra original era: " + input);
		}
		
	}
}
