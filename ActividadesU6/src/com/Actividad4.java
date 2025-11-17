package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase;
		int contadorEspacios = 0;
		
		System.out.println("Introduce una frase y te diré cuántos espacios hay en ella. ");
		frase = sc.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contadorEspacios++;
			}
		}
		
		System.out.println("La frase contiene: " + contadorEspacios);

	}

}
