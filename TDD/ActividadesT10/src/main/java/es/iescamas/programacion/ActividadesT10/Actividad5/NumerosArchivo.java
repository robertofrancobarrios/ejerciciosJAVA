package es.iescamas.programacion.ActividadesT10.Actividad5;

import java.io.BufferedReader;
import java.io.FileReader;

public class NumerosArchivo {
	
	public static void main(String[] args) {
		String archivo = "main.txt";
		int menor = Integer.MIN_VALUE;
		int mayor = Integer.MAX_VALUE;
		
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				//convertir línea a número
				int numero = Integer.parseInt(linea.trim());
				
				//comprobar si es mayor o menor que los actuales
				
				if (numero < menor) {
					menor = numero;
				}
				
				if (numero > mayor) {
					mayor = numero;
				}
			}
		}
	}
}
