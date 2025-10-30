package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta la cantidad de números: ");
		int n = sc.nextInt();
		
		// Array
		
		
		double [] tabla = new double [n];
			
		// Leer los números
		
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce un número: " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
				
		}
		
		System.out.println("La media y contador de números positivos es: " + (mediaPositivos(tabla)));
		System.out.println("La media y contador de números negativos es: " + (mediaNegativos(tabla)));
		System.out.println("El contador de ceros es: " + (cuentaCeros(tabla)));
		
	}
	
	// Media y contador de números positivos
	
	public static double mediaPositivos(double[]t) {
		double sumaPositivos = 0;
		double contadorPositivos = 0;
		for (double num : t) {
			if (num < 0) {
				sumaPositivos += num;
				contadorPositivos++;
			}
		}
		
		if (contadorPositivos == 0) {
			return 0.0;
		}
		return sumaPositivos / contadorPositivos;
		
	}
	
	// Media y contador de números negativos
	
	public static double mediaNegativos(double[]t) {
		double sumaNegativos = 0;
		double contadorNegativos = 0;
		for (double num : t) {
			if (num < 0) {
				sumaNegativos += num;
				contadorNegativos++;
			}
		}
		
		if (contadorNegativos == 0) {
			return 0.0;
		}
		
		return sumaNegativos / contadorNegativos;
		
	}
	
	// Contador de ceros
	
	public static int cuentaCeros(double[] t) {
		
		double sumaCeros = 0;
		double contadorCeros = 0;
		for (double num : t) {
			if (num == 0) {
				sumaCeros += num;
				contadorCeros++;
			}
		}
		
		if (contadorCeros == 0) {
			return 0;
			
		}
		return contadorCeros;
		
	}

	}


