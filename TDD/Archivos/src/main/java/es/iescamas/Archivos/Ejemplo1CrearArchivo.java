package es.iescamas.Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo1CrearArchivo {

	public static void main(String[] args) {
		// try-with-resources cierra automáticamente el writer
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
			
			//Escribimos varias líneas en el archivo
			writer.write("Java");
			writer.newLine();
			writer.write("Archivos de texto");
			writer.newLine();
			writer.write("DAW y DAM");
			
			System.out.println("Archivo creado y datos escritos correctamente.");
			
		} catch (IOException ex) {
			System.out.println("Error al escribir el archivo: " + ex.getMessage());
		}

	}

}
