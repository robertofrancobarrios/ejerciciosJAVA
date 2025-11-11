package com;

public class Actividad14 {
	 
	public static int contarAciertos(int[] apuesta, int[] ganadora) {
		int aciertos = 0;
		
		
		// Recorrer tabla de apuestas
		for (int i = 0; i < apuesta.length; i++) {
			// Comprobar si el numero está en la tabla ganadora
			for (int j = 0; j < ganadora.length; j++) {
				if (apuesta [i] == ganadora [j]) {
					aciertos++;
					break;
				}
			}
		}
		 
		 return aciertos;
		
	 }
	 
	 public static void main(String[] args) {
		 int [] apuesta = {9, 3, 6, 7, 8, 1};
		 int [] ganadora = {2, 1, 6, 4, 4, 3};
		 
		 System.out.println("Número de aciertos: " + contarAciertos(apuesta, ganadora));
	 }
}
