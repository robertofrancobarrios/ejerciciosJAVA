package com;

import java.util.Scanner;

public class Actividad13 {
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		// Solicitar frase al usuario
	
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();
	
		frase = frase.toLowerCase();
	
		// Crear un arreglo de 27 elementos (todas las letras del alfabeto español)
	
		int [] contadorLetras = new int [26];
	
		// Recorrer la frase caracter a caracter
	
		for (int i=0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			
			// Verificar si el caracter es una letra
			
			if (letra >= 'a' && letra <= 'z') {
				// Incrementar el contador de esa letra
				contadorLetras[letra - 'a']++;
			
			}
		}
		
		// Resultados
		
		for (int i = 0; i < 26; i++) {
			if (contadorLetras[i] > 0) {
				char letra = (char) (i + 'a'); // convierte el índice de nuevo a letra
				int cantidad = contadorLetras[i];
				System.out.println(letra + ": " + cantidad + (cantidad > 1 ? " veces" : " vez"));
			}
		}
	}
}

