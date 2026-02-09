package es.iescamas.programacion.ej3;

public class Ej3_SumaDiagonalSecundaria {
	
	public int sumaDiagonalSecundaria(int[][] m) {
		int n = m.length;
		int suma=0;
		
		for (int i = 0; i < n; i++) {
			suma += m[i][n-1-i];
		}
		
		return suma;
		
	}
		
		  
}