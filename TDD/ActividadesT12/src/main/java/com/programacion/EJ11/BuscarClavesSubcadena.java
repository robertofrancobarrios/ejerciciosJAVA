package com.programacion.EJ11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuscarClavesSubcadena {

	public static void main(String[] args) {
		
		Map<String,Integer> mapa = new HashMap<>();
		
		// DATOS DE EJEMPLO
		
		mapa.put("Pedro", 10);
		mapa.put("Pepe", 20);
		mapa.put("María", 30);
		mapa.put("Juan", 40);
		mapa.put("Jose", 50);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce subcadena: ");
		String subcadena = sc.nextLine().toLowerCase();
		
		System.out.println("\n Resultados:");
		
		// Iterar con entrySet()
		
		for(Map.Entry<String,Integer> entry : mapa.entrySet()) {
			
			String clave = entry.getKey();
			
			// comparar en minúsculas para ignorar mayúsculas
			if (clave.toLowerCase().contains(subcadena)) {
				System.out.println(clave + " -> " + entry.getValue());
			}
		}
		
		sc.close();
		
	}

}
