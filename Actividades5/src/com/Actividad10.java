package com;

import java.util.Scanner;

public class Actividad10 {
// Leer y almacenar n números enteros en una tabla. Construir otras dos tablas con los elementos pares e impares de la primera, respectivamente.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numeros = {1,4,2,4,3,2,1,1,1};
		int indicePares=0, indiceImpares = 0;
		
		// Cuenta primero cuántos pares hay (cuentaPares)
		int total = contarPares(numeros);
		
		// Crea valoresPares con tamaño cuentaPares
		int[]valoresPares = new int[total];
		
		// y valoresImpares con n - cuentaPares
		int [] valoresImpares = new int[numeros.length - total];
		
		// Recorre de nuevo y vuelca en la tabla correspondiente usando índices
		
		for (int i=0; i < numeros.length; i++) {
			// Es par
			if (numeros[i] % 2 == 0) {
				valoresPares[indicePares] = numeros[i];
				indicePares++;
				
				
			} else {
				valoresImpares[indicesImpares] = numeros[i];
				indiceImpares++;
			}
		}
		
		
		
		
		
	}
	
	public static int contarPares (int [] tabla) {
		int total = 0;
		for(int i = 0; i<tabla.length; i++) {
			if (tabla[i] % 2 == 0) {
				total++;
			}
		}
		return total;
	}
}
