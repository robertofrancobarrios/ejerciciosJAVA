package com;

public class Actividad13 {
	public static int maximo (int[] t) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i]; // Si encuentro un valor máximo en t[i], lo asigno a max
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] numeros = {2,3,4,5,6,7,6};
		
		int resultado = maximo(numeros);
		
		// resultado
		
		System.out.println("El valor máximo es: " + resultado);
	}
}
