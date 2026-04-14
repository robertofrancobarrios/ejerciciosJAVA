package es.iescamas.programacion.ActividadesT10.Actividad4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarFichero {

	public static void main(String[] args) {
		
		String fichero="carta.txt";
		int numCaracteres = 0;
		int numLineas = 0;
		int numPalabras= 0;
		
		try (BufferedReader br = new BufferedReader (new FileReader(fichero))) {
			
			String linea;
			while ((linea = br.readLine()) != null) {
				numLineas++;
				numCaracteres += linea.length();
				if (!linea.isEmpty()) {
					String[] palabras = linea.split(" ");
					numPalabras += palabras.length;
				}
			}
			
			System.out.println("Número de caracteres: " + numCaracteres);
			System.out.println("Número de líneas: " + numLineas);
			System.out.println("Número de palabras: " + numPalabras);
			
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}

	}

}
