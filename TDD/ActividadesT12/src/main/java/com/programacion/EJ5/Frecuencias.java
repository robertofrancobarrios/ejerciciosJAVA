package com.programacion.EJ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Frecuencias {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		
		String[] palabras = frase.split("\\s+");
		
		
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		// CONTAR frecuencias
		
		for (String palabra : palabras) {
			
			if (mapa.containsKey(palabra)) {
				mapa.put(palabra, mapa.get(palabra) + 1);
			} else {
				mapa.put(palabra, 1);
			}
		}
		
		// Convertir a lista
		
		List<Map.Entry<String, Integer>> lista = new ArrayList <>(mapa.entrySet());
		
		// Ordenar con comparator
		
		lista.sort((a,b) -> b.getValue() - a.getValue());
		
		for (Map.Entry<String, Integer> entrada : lista) {
			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}
		
		sc.close();
	}
	
	
}
