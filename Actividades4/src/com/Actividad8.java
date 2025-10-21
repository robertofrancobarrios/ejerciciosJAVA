package com;

import java.util.Scanner;

public class Actividad8 {

	public static boolean esPrimo(int numero) {
		
		// Números menores o iguales a 1 no son primos
		
		if (numero <= 1) {
			return false;
		}
		
		
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false; // Si es divisible no es primo
			}
		}
		
		return true; // Si no se encuentran divisores, es primo
	}
	
	public static void main(String[] args) {
		int numero = 8; // Aquí cambiamos el número a nuestro gusto
			
		if (esPrimo(numero)) {
			System.out.println(numero + " es un número primo");
			 
		} else {
			System.out.println(numero + " no es un número primo");
		}
		
	}
}
