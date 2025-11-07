package com;
import java.util.Arrays;
public class Actividad8 {
	public static int[] sinRepetidos(int t[]) {
		// Crear un arreglo res con el primer elemento de t
		int[] res = new int[1];
		res[0] = t[0];
		
		// Recorrer el arreglo t desde el indice 1
		for (int i =1; i < t.length; i++) {
			if (!contiene(res, t[i])) {
				res = insertar(res, t[i]);
				
				
			}
		}
		
		return res;
	}
	
	// Función para comprobar si un valor está en el arreglo
	
	public static boolean contiene(int[] res, int valor) {
		for (int i = 0; i < res.length; i++) {
			if (res[i] == valor) {
				return true; // El valor ya está en el arreglo
			}
		}
		return false; // El valor no está en el arreglo
	}
	
	// Función para insertar un valor al final del arreglo
	
	public static int[] insertar (int[] res, int valor) {
		// Crear un nuevo arreglo con un tamaño mayor
		
		int [] nuevoRes = Arrays.copyOf(res, res.length +1);
		nuevoRes[res.length] = valor; // Insertar el nuevo valor al final
		return nuevoRes;
		
	}
	
	// Método principal para probar la función
	
	public static void main(String[] args) {
		int[] t = {1,2,3,2,4,1,5,6,3};
		
		int[] result = sinRepetidos(t);
		
		System.out.println("Array sin elementos repetidos: " + Arrays.toString(result)); // Salida [1,2,3,4,5,6]
		
	}
}
