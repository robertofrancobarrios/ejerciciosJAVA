package com;

import java.util.Scanner;

// Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5 × 4 × 3 × 2 × 1 = 120.

public class Actividad8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Ingresa un número y calcularé el factorial");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("El número es negativo. Inserta un número positivo.");
	
		} else {
			
			long factorial = 1;
			
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
				
				
		}
			System.out.println("El factorial de " + numero + " es : " + factorial);
			
		}
		
	}
}
