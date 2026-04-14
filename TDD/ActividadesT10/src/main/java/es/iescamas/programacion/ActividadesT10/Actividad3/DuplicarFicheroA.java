package es.iescamas.programacion.ActividadesT10.Actividad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DuplicarFicheroA {
	
	public static void main(String[] args) {
		
		String ficheroOrigen = "original.txt";
		String ficheroDestino = "copia.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
				FileWriter fw = new FileWriter(ficheroDestino, false)) { // false borra contenido si existe
			
			String linea;
			while ((linea = br.readLine()) != null) {
				fw.write(linea + "\n");
			}
			
			System.out.println("Fichero duplicado correctamente en copia.txt");
			
		} catch (IOException e) {
			System.out.println("Error al duplicar el fichero: " + e.getMessage());
		}
	}
}
