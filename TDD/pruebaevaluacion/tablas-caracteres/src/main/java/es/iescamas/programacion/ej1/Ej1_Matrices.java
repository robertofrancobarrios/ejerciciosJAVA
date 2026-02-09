package es.iescamas.programacion.ej1;

/**
 * Ejercicio 1
 */

public class Ej1_Matrices {
	
	  public static int[][] sumaMatrices(int[][] a, int[][] b) {

	        if (a.length != b.length) {
	            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
	        }

	        for (int i = 0; i < a.length; i++) {
	            if (a[i].length != b[i].length) {
	                throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
	            }
	        }

	        int[][] resultado = new int[a.length][a[0].length];

	        for (int i = 0; i < a.length; i++) {          
	            for (int j = 0; j < a[i].length; j++) {   
	                resultado[i][j] = a[i][j] + b[i][j];
	            }
	        }

	        return resultado;
	    }
	}



