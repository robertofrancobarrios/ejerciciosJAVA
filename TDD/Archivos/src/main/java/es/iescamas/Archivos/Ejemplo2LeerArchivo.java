package es.iescamas.Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2LeerArchivo {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
			
			String linea;
			
			// Leemos hasta que no queden más líneas
			while ((linea = reader.readLine()) != null) {
				System.out.println("Línea leída: " + linea);
			}
			
		} catch (IOException ex) {
			System.out.println("Error al leer el archivo: " + ex.getMessage());
		}

	}

}
