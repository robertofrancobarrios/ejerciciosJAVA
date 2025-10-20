package com;

import java.util.Scanner;

public class Actividad3 {
	public static void calcularCilindro(int opcion, double radio, double altura) {
		final double pi = Math.PI;
		
		if (opcion == 1) {
			// Calculo del área
			double area = 2 * pi * radio * (altura + radio);
			System.out.println("El área del cilindro es: " + area);
			
		} else if (opcion == 2) {
			// Volumen
			double volumen = pi * radio * radio * altura;
			System.out.println("El volumen del cilindro es: " + volumen);
		} else {
			System.out.println("Inserte un número válido.");
		}
		
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 1 para calcular el área, 2 para calcular el volumen");
		int opcion = sc.nextInt();
		
		System.out.println("Ingresa el radio: ");
		int radio = sc.nextInt();
		
		System.out.println("Ingresa la altura: ");
		int altura = sc.nextInt();
		
		calcularCilindro(opcion, radio, altura);
	}
		
	}


