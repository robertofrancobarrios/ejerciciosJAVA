package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombreApellidos;
		
		System.out.println("Inserta tu nombre y apellidos");
		nombreApellidos = sc.nextLine();
		
		// El programa debe eliminar cualquier vocal del nombre
		
		String vocales = "aeiouáéíóúàèìòùäëïöüAEIOUÁÉÍÓÚÀÈÌÒÙÄËÏÖÜ";
		
		// Para construir el resultado sin vocales
		
		StringBuilder resultado = new StringBuilder();
		
		for (int i = 0; i < nombreApellidos.length(); i++) {
			char c = nombreApellidos.charAt(i);
	
			// Añadir caracter solo si no es vocal
			
			if (vocales.indexOf(c) == -1) {
				resultado.append(c);
				
			}
		}
		
		System.out.println("Resultado sin vocales: " + resultado);
	}

}
