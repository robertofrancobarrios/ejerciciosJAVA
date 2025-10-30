package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {
	
	// Para borrar el elemento de la posición indicada
	public static int[] borrarElemento(int[] t, int pos) {
		// Intercambiar elemento en pos con el último
		int temp = t[pos];
		t[pos] = t[t.length-1];
		t[t.length-1] = temp;
		
		// Devuelve la copia con una posición menos
		
		return Arrays.copyOf(t, t.length -1);
		
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Inicializar la tabla con los números:
		
		int[] tabla = {7,9,16,19,20};
		
		int pos;
		
		do {
			System.out.println("Tabla actual: " + Arrays.toString(tabla));
			System.out.println("Introduce el índice del elemento a eliminar (si pones un número negativo, sales del programa): ");
			pos = sc.nextInt();
			
			if (pos >= 0) {
				if (pos >= tabla.length) {
					System.out.println(" ERROR: Índice fuera de rango.");
			
				} else {
					tabla = borrarElemento(tabla,pos);
					System.out.println("Elemento eliminado. \n");
					
				}
			}
		} while (pos >= 0 && tabla.length > 0);
		
		System.out.println("\nFin. Tabla final: " + Arrays.toString(tabla));
	}
	

}
