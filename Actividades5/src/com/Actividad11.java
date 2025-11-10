package com;

import java.util.Scanner;

public class Actividad11 {
	 // Matriz mágica
			static int [][] matrizMagica = {{1,15,14,4}, {12,6,7,9}, {8,10,11,5}, {13,3,2,16}};
	
	public static void main (String[] args) {
		
	
		
		
		// leer matriz
		
		System.out.println(sumaFila(matrizMagica, 3));
		
		
	}
	
	public static int sumaFila (int [][] matriz, int posicion ) {
		int [] fila = matriz[posicion];
		int acumulador = 0;
		for (int numero : fila) {
			acumulador+=numero;
		}
		return acumulador;
	}
	
	public static int sumaColumna(int [][] matriz, int posicion) {
		int [] columna = 
	}
}
