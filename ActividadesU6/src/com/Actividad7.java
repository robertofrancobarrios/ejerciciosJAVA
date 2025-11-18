package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		String palabra;
		
		System.out.println("Introduce una frase");
		frase = sc.nextLine();
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		
		int contadorPalabra = 0;
		int index = 0;
		
		while ((index = frase.indexOf(palabra, index)) != -1) {
			contadorPalabra++;
			index += palabra.length();
		}
		
		System.out.println("La palabra: " + palabra + " aparece: " + contadorPalabra + " veces");
		
			
	}
		
		
}


