package com;

public class Actividad12 {
	public static void mostrarMatriz(int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[f].length; c++) {
				System.out.print(matriz[f][c] + "\t"); // \t separa las columnas
			}
			System.out.println(); // Salto para cada línea
			
		}
	}
	
	public static void main (String[] args) {
		int [][] matriz = new int [5][5];
		
		// Rellenar la matriz
		
		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				matriz [f][c] = f + c;
			}
		}
		
		// Mostrar matriz
		
		mostrarMatriz(matriz);
	}
}
