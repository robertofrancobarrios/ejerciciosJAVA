package com;

import java.util.Scanner;

public class Actividad1 {
	
	// Diseñar la función eco() a la que se le pasa como parámetro un número n y muestra por pantalla n veces el mensaje “Eco ...”.
	
	// Definición de la función eco
	
	
	public static void eco(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Eco... ");
		}

	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte el número de repeticiones: ");
		int n = sc.nextInt();
		eco(n);
	}
}
