package com;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Actividad6 {

	public static boolean esVocal(char c) {
		
		// Convierto en minúscula la letra
		c = Character.toLowerCase(c);
		
		// Compruebo si es vocal
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
			
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Pido una letra
		
		System.out.println("Ingrese una letra: ");
		char caracter = sc.next().charAt(0); // Coge la primera letra introducida
		
		boolean resultado = esVocal(caracter);
		
		// Resultado
		
		if (resultado) {
			System.out.println("El carácter '" + caracter + "' es una vocal.");
			
		} else {
			System.out.println("El carácter '" + caracter + "' no es una vocal.");
		}
		
		
		
	}
}