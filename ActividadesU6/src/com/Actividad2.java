package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String contraseña, intento = "";
		
		// El primer jugador introduce la contraseña
		System.out.println("Jugador 1, introduce la contraseña: ");
		contraseña = sc.nextLine();
		
		// PISTAS
		
		System.out.println("Número de caracteres: " + contraseña.length());
		System.out.println("Primer caracter: " + contraseña.charAt(0) + " " + "\nÚltimo caracter: " + contraseña.charAt(contraseña.length() - 1 ));
		
		// Bucle para que el segundo usuario pueda intentar encontrar la contraseña
		
		/* while (!intento.equals(contraseña)) {
			System.out.println("Jugador 2, introduce tu intento: ");
			intento = sc.nextLine();
			
			if (!intento.equals(contraseña)) {
				System.out.println("Incorrecto, prueba otra vez");
			} else {
				System.out.println("Enhorabuena! Has acertado");
			}
		} */
		
		// Segunda versión (se facilita el juego indicando si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña
		
		while (!intento.equals(contraseña)) {
			System.out.println("Jugador 2, introduce tu intento: ");
			intento = sc.nextLine();
			
			if (!intento.equals(contraseña) && (intento.length() < contraseña.length()))  {
				System.out.println("La contraseña es incorrecta. La palabra que has introducido es menor, alfabéticamente, que la contraseña.");
			} else if (!intento.equals(contraseña) && (intento.length() > contraseña.length())) {
				System.out.println("La contraseña es incorrecta. La palabra que has introducido es mayor, alfabéticamente, que la contraseña.");
				
			} else if (!intento.equals(contraseña) && (intento.length() == contraseña.length())) {
				System.out.println("La contraseña es incorrecta. La palabra que has introducido es igual, alfabéticamente, que la contraseña.");
			} else {
				System.out.println("Enhorabuena! Has acertado. ");
			}
		}
		
		
		
		
	}

}
