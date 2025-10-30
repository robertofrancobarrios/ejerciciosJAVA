package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// ¿Cuántos números vas a introducir?
		
		
		System.out.println("¿Cuántos números vas a introducir? ");
		int n = sc.nextInt();
		
		
		// Array para almacenar los números
		
		int[] tabla = new int [n];
		
		
		// Leyendo el teclado
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Introduce un número " + (i + 1) + ": ");
			tabla[i] = sc.nextInt();
			
		}
		
		// En orden inverso
		
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.println(tabla[i]);
		}
		
		

	}

}
