package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int etiqueta = 0;
		int arbolMasAlto = 0;
		int alturaMasAlta = 0;
		
		while (true) {
			System.out.println("Introduce la altura del árbol " + etiqueta + " (en cm), o -1 para terminar: ");
			int altura = sc.nextInt();
			
			if (altura == -1) {
				break;
				
				
			}
			
			if (altura > alturaMasAlta) {
				alturaMasAlta = altura;
				arbolMasAlto = etiqueta;
			}
			
			etiqueta++;
		}
		
		if (arbolMasAlto != -1) {
			System.out.println("\nEl árbol más alto es el árbol con etiqueta #" + arbolMasAlto);
			System.out.println("Altura: " + alturaMasAlta + " cm");
			
		} else {
			System.out.println("\nNo se ingresaron alturas válidas.");
		}
	}
	
}
