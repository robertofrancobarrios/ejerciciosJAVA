package com;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("1) Saludar 2) Despedir 0) Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1 -> System.out.println("Hola!");
			case 2 -> System.out.println("Adiós!");
			case 0 -> System.out.println("Saliendo...");
			default -> System.out.println("Opción inválida");
			
			}
		} while (opcion != 0);
	}

}
