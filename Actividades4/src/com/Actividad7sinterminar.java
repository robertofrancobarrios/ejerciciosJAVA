package com;

public class Actividad7sinterminar {
	
	// Diseñar una función que determine si un número es primo.
	
	public static boolean esPrimo (int numero) {
		
		if (numero < 2) {
			return false;
		}
		return false;
		
		// Solo necesitamos verificar hasta la raíz cuadrada del número
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false; // Si es divisible, no es primo
			}
		}
		
		return true; // Si no se encontró divisor, es primo
		
	}
}