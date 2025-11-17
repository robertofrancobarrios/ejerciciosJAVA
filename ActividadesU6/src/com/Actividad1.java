package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		
		System.out.println("Dime una palabra");
		palabra1 = sc.nextLine();
		System.out.println("Dime otra palabra");
		palabra2 = sc.nextLine();
		
		if (palabra1.length() > palabra2.length()) {
			System.out.println("La palabra 2 es más corta");
		} else if (palabra1.length() == palabra2.length()) {
			System.out.println("Las dos palabras tienen la misma longitud");
		} else {
			System.out.println("La palabra 1 es más corta");
		}
		System.out.println("palabra1: " + palabra1 + ", palabra2: " + palabra2 );
	}

}
