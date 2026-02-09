package es.clases;

import java.util.function.BooleanSupplier;

public class StudentToolkit {

	private int contador;
	
	public StudentToolkit() {
		this.contador=0;
	}
	
	public int getContador() {
		
		return contador;
	}

	public void incrementar() {
		contador++;
		
	}

	public void decrementar() {
		contador--;
		
	}

	public void reset() {
		contador=0;
		
	}

	public boolean esCero() {
		if (contador == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean esPositivo() {
		if (contador > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void addSiPositivo(int i) {
		if (i > 0) {
			contador += i;
		} else {
			return;
		}
		
		
		
	}

	public void incrementarNVeces(int i) {
		if (i <= 0) {
			return;
		}
		
		for (int n=0; n<i; n++) {
			contador++;
		}
		
	}

	public int sumaHasta(int i) {
		if (i <= 0) {
			return 0;
		}
		
		int suma=0;
		for (int n=1; n<=i; n++) {
			suma += n;
		}
		
		return suma;
	}

	public boolean esPar(int i) {
		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public double media(int[] v) {
		
		if (v == null || v.length==0) {
			throw new IllegalArgumentException("Null o vacío");
		}
		
		int suma = 0;
		
		for (int num : v) {
			suma += num;
		}
		
		
		return (double) suma / v.length;
	}

	public int maximo(int[] v) {
		
		if (v == null || v.length ==0) {
			throw new IllegalArgumentException("Null o vacío");
		}
		
		int max = v[0];
		
		for (int i=0; i<v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
		}
		
		return max;
	}

	public int[] invertirArray(int[] v) {
		
		
		int [] invertido = new int [v.length];
		
		for (int i= 0; i < v.length; i++) {
			invertido [i] = v[v.length - 1 - i];
		}
		
		return invertido;
	}

	public int[] sinRepetidos(int[] v) {
		
		int [] resultado = new int [v.length - 1];
		int contador = 0;
		
		for (int i=0; i < v.length; i++) {
			boolean repetido = false;
			for (int j=0; j < contador; j++) {
				if (v[i] == resultado[j]) {
					repetido=true;
					break;
				}
			}
			
			if (!repetido) {
				resultado[contador] = v[i];
				contador++;
			}
			
		}
		
		int [] arrayFinal = new int [contador];
		for (int i=0; i < contador; i++) {
			arrayFinal[i] = resultado[i];
		}
		
		
		return arrayFinal;
	}		
	
}


