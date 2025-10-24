package com;

public class Actividad13 {
	public static long factorial(int n) {
		if (n == 0) {
			return 1;
			
		} else {
			return n * factorial(n - 1);
			
		}
	}
	
	public static void main(String[] args) {
		
		int n = 7; // Cambiar este valor para calcular el resultado
		long resultado = factorial (n);
		System.out.println("El factorial de " + n + " es " + resultado);
		
	}
}