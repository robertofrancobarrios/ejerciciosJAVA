package com;

public class Actividad10 {
	
	// Para codificar una palabra según los conjuntos 1 y 2
	
	public static char codificador(char[] conjunto1, char[] conjunto2, char c ) {
		
		// Convertir todo a minúsculas
		
		c = Character.toLowerCase(c);
		
		// Buscar el índice en el conjunto 1
		
		for (int i = 0; i < conjunto1.length; i++) {
			if (conjunto1[i] == c) {
				
				// Si lo encuentra, devuelve el caracter correspondiente en conjunto2
				return conjunto2[i];
				
			}
			
			// Si el carácter no está en conjunto1, devolverlo tal cual
		}
		
		return c;
	}
	
	public static void main (String[] args) {
		
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		// TEXTO A CODIFICAR
		String textoOriginal = "Joselito";
		
		// StringBuilder para almacenar el texto codificado
		StringBuilder textoCodificado = new StringBuilder();
		
		// Para recorrer el texto original
		for (int i=0; i < textoOriginal.length(); i++) {
			char c = textoOriginal.charAt(i);
			// Codificar el caracter y añadirlo al resultado
			textoCodificado.append(codificador(conjunto1, conjunto2, c));
			
		}
			
		// Para mostrar el texto codificado
		
		System.out.println("El texto original es: " + textoOriginal);
		System.out.println("El texto codificado es: " + textoCodificado);
	}
	
}
