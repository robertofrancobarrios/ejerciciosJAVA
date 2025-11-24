package com;

import java.util.Scanner;

public class Actividad9 {
	
	// Para eliminar la muletilla inicial
	
	public static String eliminarMuletillaInicial(String frase) {
		String muletillaInicial = "Javalín, javalón";
		frase = frase.trim();
		
		// Comprobar si la frase comienza con muletilla
		
		if (frase.startsWith(muletillaInicial)) {
			
			// elimina la muletilla y los espacios/tabuladores
			
			return frase.substring(muletillaInicial.length()).trim();
		}
		
		return null; // No se ha encontrado la muletilla inicial
	}
	
	// Para recortar la muletilla final
	
	public static String eliminarMuletillaFinal (String frase) {
		String muletillaFinal = "Javalén, len, len";
		frase = frase.trim();
		
		
		// Comprobar si la frase termina con muletilla
		
		if (frase.endsWith(muletillaFinal)) {
			
			// elimina la muletilla y los espacios/tabuladores
			
			return frase.substring(0, frase.length() - muletillaFinal.length()).trim();
			
		}
		
		return null; // No se ha encontrado la muletilla final
	}
	
	// MAIN
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un mensaje en el idioma de Javalandia ");
		String frase = sc.nextLine();
		
		String mensaje = eliminarMuletillaInicial(frase);
		
		if (mensaje == null) {
			mensaje = eliminarMuletillaFinal(frase);
		}
		
		if (mensaje != null) {
			System.out.println("Sí, está en el idioma de Javalandia y el mensaje central es: " + mensaje);
		} else {
			System.out.println("El mensaje no está en idioma de Javalandia");
		}
		
		
	}
}
