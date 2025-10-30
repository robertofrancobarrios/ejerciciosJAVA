package com;

import java.util.Scanner;

public class Actividad1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] t = new double[5];
		
		// Para leer los 5 números
		
		for (int i = 0; i < 5; i++) {
			
		
		System.out.println("Introduce el número decimal: " + (i + 1) + ": ");
		t[i] = sc.nextDouble();
		}
		
		// Mostrar los números en el mismo orden
		
		for (int i = 0; i<5; i++) {
			System.out.println("Numero: " + (i + 1) + " : " + t[i]);
		}
	}
}
