package com;

public class Actividad9 {
	public static boolean esPrimo (int numero) {
		if (numero <= 1) return false;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) return false;
			
		}
		return true;
	}
	
	public static void divisoresPrimos(int numero) {
		System.out.println("Los divisores primos de " + numero + " son: ");
		boolean tienePrimos = false;
		
		for (int i = 2; i <= numero; i++) {
			if (numero % i == 0 && esPrimo(i)) {
				System.out.println(i + "");
				tienePrimos = true;
				
				
			}
		}
		
		if (!tienePrimos) {
			System.out.println("ninguno ");
		}
	}
	
	public static void main(String[] args) {
		int numero = 60;
		divisoresPrimos(numero);
	}
}	


