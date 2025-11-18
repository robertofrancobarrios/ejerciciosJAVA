package com;

public class Actividad6 {

	public static void main(String[] args) {
		String cadena = "¿Cómo estás?";
		String cadenaReversa = reversa(cadena);
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena al revés: " + cadenaReversa);
	}
	
	public static String reversa(String cadena) {
		StringBuilder reversa = new StringBuilder(cadena);
		reversa.reverse();
		return reversa.toString();
		
	}
}
