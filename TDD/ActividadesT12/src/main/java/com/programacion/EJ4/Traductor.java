package com.programacion.EJ4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Traductor {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("Hola", "Hello");
		diccionario.put("Adiós", "Bye");
		diccionario.put("Comer", "Eat");
		diccionario.put("Dormir", "Sleep");
		diccionario.put("Gato", "Cat");
		diccionario.put("Perro", "Dog");
		diccionario.put("Teclado", "Keyboard");
		diccionario.put("Ratón", "Mouse");
		diccionario.put("Tecla", "Key");
		diccionario.put("Beber", "Drink");
		
		System.out.println("Introduce una palabra en español y te diré su significado en inglés: ");
		String palabra = sc.nextLine();
		
		String traduccion = diccionario.get(palabra);
		
		if (traduccion != null) {
			System.out.println("Traduccion: " + traduccion);
		} else {
			System.out.println("Esa palabra no existe en el diccionario.");
		}
		
		sc.close();
	}
}
