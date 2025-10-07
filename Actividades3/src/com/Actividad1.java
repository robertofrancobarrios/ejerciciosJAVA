package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Se pide un número entero. El programa se detendrá cuando introduzcas 0.");
		
		do {
			System.out.println("Introduce un número ");
			numero = sc.nextInt();
			
			if (numero != 0) {
				// ¿Es PAR?
				if (numero % 2 == 0) {
					System.out.println("El número " + numero + " es PAR");
					
				} else {
					System.out.println("El número " + numero + " es IMPAR");
				}
				
				// Verificar si el número es positivo 
				
				if (numero > 0) {
					System.out.println("El número " + numero + " es POSITIVO");
					
				} else if (numero < 0) {
					System.out.println("El número " + numero + " es NEGATIVO");
				} else {
					System.out.println("El número " + numero + " es CERO");
				}
				
				// Calcular el cuadrado del número
				
				int cuadrado = (int)numero * numero;
				System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
				System.out.println("------------------------------------");
				
			}
		} while (numero != 0);
		
		System.out.println("Fin del programa. ");

	}

}
