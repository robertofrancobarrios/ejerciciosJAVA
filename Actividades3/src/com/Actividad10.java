package com;

import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
		// Pide al usuario un número entre 1 y 10, y debe mostrar la tabla de multiplicar.
		
				Scanner sc = new Scanner(System.in);;
				int numero;
				// Asegurarme de que el número está entre el 1 y el 10
				do {
					System.out.println("Introduce un número del 1 al 10: ");
					numero = sc.nextInt();
					
					if (numero < 1 || numero > 10);
					System.out.println("El número no está dentro del rango, por favor, prueba de nuevo. ");
					
				} while (numero < 1 || numero > 10);
				
				for (int i=0; i<=10; i++) {
					System.out.println(numero + " x " + i + " = " + (numero * i));
					 
				}
				
				
				
			}

}		
