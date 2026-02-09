package es.iescamas.programacion.ej1;

public class Main {

	 public static void main(String[] args) {
	        int[][] matriz1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matriz2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        int[][] resultado = Ej1_Matrices.sumaMatrices(matriz1, matriz2);

	    
	        
	        for (int i = 0; i < resultado.length; i++) {
	            for (int j = 0; j < resultado[i].length; j++) {
	                System.out.print(resultado[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

