package es.tabla;

import java.lang.reflect.Array;

public class ArrayApp {
	public int[] invertirArray(int[] array) {
		
		// Crear un nuevo array del mismo tamaño
		
		int[] invertido = new int[array.length];
		
		// Recorrer el array original y copiar al revés
		
		for (int i = 0; i < array.length; i++) {
			invertido[i] = array[array.length - 1 - i];
		}
		
		return invertido;
		
	}
	
	public double mediaPositivos(int[] t) {
		int suma = 0;
		int contador = 0;
		
		for (int num : t) {
			if (num > 0) {
				suma += num;
				contador++;
			}
		}
		
		// Si no hay positivos, 0
		
		if (contador == 0) {
			return 0;
		}
		
		return suma/contador;
		
	}
	
	public double mediaNegativos(int[] t) {
		int suma = 0;
		int contador = 0;
		
		for (int num : t) {
			if (num < 0) {
				suma += num;
				contador++;
			}
		}
		
		// Si no hay negativos, 0
		
		if (contador == 0) {
			return 0;
		}
		
		return suma/contador;
	}
	
	public int cuentaCeros(int[] t) {
		int suma = 0;
		int contador = 0;
		
		for (int num : t) {
			if (num == 0) {
				suma += num;
				contador ++;
			}
		}
		
		return contador;
	}
	
	public int[] borrarElemento(int[] t, int pos) {
		
		
		// Posición inválida lanza excepción
		
		if (pos < 0 || pos >= t.length) {
			throw new IllegalArgumentException("posicion invalida");
		}
		
		int [] nuevo = new int [t.length -1];
		
		for (int i= 0; i < pos; i++) {
			nuevo[i] = t[i];
		}
		
		for (int i= pos +1; i < t.length; i++) {
			nuevo[i - 1] = t[i];
		}
		
		return nuevo;
	
	}
	
	public int[] sinRepetidos(int[] t) {
		
		int [] resultado = new int [t.length -1];
		int contador = 0;
		
		// Si t[i] ya está en el resultado
		
		for (int i=0; i < t.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < contador; j++) {
				if (t[i] == resultado[j]) {
					repetido = true;
					break;
				}
			}
			
			// Si no, se añade
			
			if (!repetido) {
				resultado[contador] = t[i];
				contador++;
			}
		}
		
		int[] finalArray = new int[contador];
		for (int i=0; i < contador; i++) {
			finalArray[i] = resultado[i];
		}
		
		return finalArray;
		
		
	}
	
	public int[] fusionOrdenada(int[] a, int[] b) {
		int[] resultado = new int[a.length + b.length];
		
		int i = 0;
		int j = 0;
		int k = 0; // índice para resultado
		
		// Comparación y agregar el menor de a[i] y el menor de b[j]
		
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				resultado[k] = a[i];
				i++;
			} else {
				resultado[k] = b[j];
				j++;
			}
			
			k++;
		}
		
		// Si quedan elementos en a, los agregamos
		
		while (i < a.length) {
			resultado[k] = a[i];
			i++;
			k++;
		}
		
		// Si quedan elementos en b, los agregamos
		
		while (j < b.length) {
			resultado[k] = b[j];
			j++;
			k++;
		}
		
		return resultado;
		
		
		
	}
	
	public int[][] separarParesImpares(int[] t) {
		
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for (int num : t) {
			if (num % 2 == 0) {
				contadorPares++;
			} else {
				contadorImpares++;
			}
		}
		
		int [] pares = new int[contadorPares];
		int [] impares = new int[contadorImpares];
		
		// Recorrer de nuevo y rellenar los arrays
		
		int iPares= 0;
		int iImpares=0;
		
		for (int num : t) {
			if (num % 2 == 0) {
				pares[iPares] = num;
				iPares++;
			} else {
				impares[iImpares] = num;
				iImpares++;
				
			}
		} 
		
		return new int[][] {pares, impares};
		
	}
	
	public boolean esMatrizMagica(int[][] m) {
		
		if (m == null || m.length != 4) {
			throw new IllegalArgumentException("matriz debe ser 4x4");
		}
		
		for (int i=0; i<4; i++) {
			if (m[i] == null || m[i].length != 4) {
				throw new IllegalArgumentException("matriz debe ser 4x4");
			}
		}
		
		
		// suma de referencia
		
		int sumaObjetivo = 0;
		
		for (int j=0; j < 4; j++) {
			sumaObjetivo += m[0][j];
		}
		
		// Comprobar filas
		
		for (int i=0; i<4; i++) {
			int sumaFila=0;
			for (int j=0;j<4;j++) {
				sumaFila += m[i][j];
			}
			if (sumaFila != sumaObjetivo) {
				return false;
			}
		}
		
		return true;
		
		
		
		
	}
	
	public int[][] rellenaSumaIndices() {
		int [][] m = new int [5][5];
		
		for (int f = 0; f < 5; f++) {
			for (int c=0; c<5; c++) {
				m[f][c] = f + c;
			}
		}
		
		return m;
	}
	
	public int maximo(int[] t) {
		
		if (t == null) {
			throw new IllegalArgumentException("array no puede ser null");
		}
		
		if (t.length == 0) {
			throw new IllegalArgumentException("array vacio");
		}
		
		int max = Integer.MIN_VALUE;
		for(int numero:t) {
			if(numero > max) {
				max = numero;
			}
		}
		return max;
	}
	
	
	
	
	
	
	
}
