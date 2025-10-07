package com;

import java.util.Random;
import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		
		// Crear el número RANDOM
		Random random = new Random();
		int numeroSecreto = random.nextInt(100) + 1; // Genera un número entre 1 y 100
		
		// Iniciar variables
		Scanner sc = new Scanner(System.in);
		int supuesto;
		int intentos = 0;
		
		System.out.println("Juego del número secreto");
		System.out.println("Intenta adivinar un número entre el 1 y el 100, si escribes -1 te rendirás.");
		
		// Empieza el juego
		
		do {
			System.out.println("Ingresa el número que creas que es: ");
			supuesto = sc.nextInt();
			intentos ++;
			
			// Compruebo si el usuario se ha rendido
			if (supuesto == -1) {
				System.out.println("Te has rendido. ");
				break; // Termina el juego y el programa.
				
			}
			
			// Comprobamos el número SUPUESTO (el que ha introducido el usuario intentando adivinar)
			if (supuesto < numeroSecreto) {
				System.out.println("El número introducido es menor que el número secreto.");
			} else if (supuesto > numeroSecreto) {
				System.out.println("El número introducido es mayor que el número secreto.");
				
			} else {
				System.out.println("Adivinaste!");
			}
			
		} while (supuesto != numeroSecreto);
		
	}
	
	
}
