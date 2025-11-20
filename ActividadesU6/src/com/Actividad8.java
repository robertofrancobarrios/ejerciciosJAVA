package com;

import java.util.Scanner;

public class Actividad8 {

	public static String reversa(String cadena) {
		StringBuilder reversa = new StringBuilder(cadena);
		reversa.reverse();
		return reversa.toString();
		
	}
	
	public static String limpiarCadena (String cadena) {
		
		
		return cadena.replaceAll("[^a-zA-Z]", "").toLowerCase();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase y te diré si es palíndroma o no. ");
		String frase = sc.nextLine();
		
		String fraseLimpia = limpiarCadena(frase);
		String fraseReversa = reversa(fraseLimpia);

		if (fraseReversa.equals(fraseLimpia)) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}
		
	
	}
}
