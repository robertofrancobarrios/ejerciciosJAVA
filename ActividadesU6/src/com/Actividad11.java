package com;

import java.util.Scanner;

public class Actividad11 {

	public static char descodificador(char[] conjunto1, char[] conjunto2, char c ) {
		
		// Convertir todo a minúsculas
		
		c = Character.toLowerCase(c);
		
		// Buscar el índice en el conjunto 1
		
		for (int i = 0; i < conjunto2.length; i++) {
			if (conjunto2[i] == c) {
				
				// Si lo encuentra, devuelve el caracter correspondiente en conjunto2
				return conjunto1[i];
				
			}
			
			// Si el carácter no está en conjunto1, devolverlo tal cual
		}
		
		return c;
	}
	
public static void main (String[] args) {
		
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		// TEXTO A DESCODIFICAR
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una frase codificada, y te mostraré la frase descodificada: ");
		
		String textoOriginal = sc.nextLine();
		
		// StringBuilder para almacenar el texto codificado
		StringBuilder textoCodificado = new StringBuilder();
		
		// Para recorrer el texto original
		for (int i=0; i < textoOriginal.length(); i++) {
			char c = textoOriginal.charAt(i);
			// Codificar el caracter y añadirlo al resultado
			textoCodificado.append(descodificador(conjunto1, conjunto2, c));
			
		}
			
		// Para mostrar el texto codificado
		
		System.out.println("El texto codificado es: " + textoOriginal);
		System.out.println("El texto descodificado es: " + textoCodificado);
	
	
	}
}