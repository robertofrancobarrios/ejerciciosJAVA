package com;
import java.util.Arrays;
import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Leer las tablas
		
		int[] t1 = new int[6];
		int[] t2 = new int[6];
		
		System.out.println("Introduce los 6 números enteros para la primera serie: ");
			for (int i = 0; i < t1.length; i++) {
				t1 [i] = sc.nextInt();
		}
		System.out.println("Introduce los 6 números enteros para la segunda serie: ");
			for (int i = 0; i <t2.length; i++) {
				t2 [i] = sc.nextInt();
			}
			
		// Ordeno los arrays
			
			Arrays.sort(t1);
			Arrays.sort(t2);
			
		// Para mostrar las tablas ordenadas
			
			System.out.println("La primera tabla ordenada: " + Arrays.toString(t1));
			System.out.println("La segunda tabla ordenada: " + Arrays.toString(t2));
			
		// Mostrar la tercera tabla
			
			int[] t3 = new int [t1.length + t2.length];
			int i1 = 0, i2 = 0, i3 = 0;
			
			while (i3 < t3.length) {
				// Si ya se han usado los elementos de t1 
				if (i1 == t1.length) {
					t3 [i3++] = t2 [i2++];
					
				} 
				
				else if(i2 == t2.length)  {
				// Si ya se han usado los elementos de t2
					t3[i3++] = t1 [i1++];
				
				}
				
				// Comparar los elementos actuales y elegir el menor
				
				else if (t1[i1] < t2[i2]) {
					t3[i3++] = t1[i1++];
					
				} else {
					t3[i3++] = t2[i2++];
				}
				
			}
			
			// Tabla final ordenada:
			
			System.out.println("La tabla final fusionada es: " + Arrays.toString(t3));
			
	}
	
}
