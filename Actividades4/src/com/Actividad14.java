package com;
// 1,1,2,3,5,8,13,21
public class Actividad14 {
	public static long fibonacci (int n) {
		
		if (n == 0 || n == 1) {
		return 1;
		
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		long resultado = fibonacci(n);
		System.out.println("El término " + n + " de la serie de Fibonacci es: " + resultado);
	}
}
