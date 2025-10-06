package com;

import java.util.Scanner;

public class TablaDeMultplicar {

	public static void main(String[] args) {
		// Pide al usuario un número y debe mostrar la tabla de multiplicar, usando FOR
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número.");
		int numero = sc.nextInt();
		
		for (int i=0; i<=10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
		
		
	}

}
