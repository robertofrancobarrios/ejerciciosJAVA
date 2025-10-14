package com;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número n: ");
		int n = sc.nextInt();
		
		int contadorPrimos = 0;
		
		for (int i = 2; i <= n; i++) {
			int divisores = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					divisores ++;
				}
			}
			
		if (divisores == 2) {
			System.out.println(i + " -> primo");
			contadorPrimos++;
			
		} else {
			System.out.println(i + " -> no es primo");
		}
	}

	System.out.println("Total de números primos entre 2 y " + n + ": " + contadorPrimos);	
	}
}