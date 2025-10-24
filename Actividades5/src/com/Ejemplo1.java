package com;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Tabla de 5 elementos
		int [] numeros = new int[5];
		numeros[0]= 0;
		numeros[1]= 1;
		numeros[2]= 2;
		numeros[3]= 3;
		numeros[4]= 10;
		
		int[] numeros2 = {3,4,5,10,20,234,342};
		
		System.out.println("El tamaño de la tabla es: " + numeros.length);
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		/*
		int j = 0;
		
		while (j<numeros2.length); {
			System.out.println(numeros2[j]);
		}
		*/

	}

}
