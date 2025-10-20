package com;

import java.util.Scanner;

public class Actividad4 {
	public static int numeroMayor (int a, int b) {
					
		if (a > b) {
			return a;
			
		} else {
			return b;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número: ");
		int a = sc.nextInt();
		
		System.out.println("Inserte el segundo número: ");
		int b = sc.nextInt();
		
		int resultado = numeroMayor (a, b);
		
		System.out.println("El mayor de " + a + " y " + b + " es: " + resultado);
		
		
		
	}
}
