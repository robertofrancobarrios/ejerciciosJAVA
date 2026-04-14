package es.iescamas.Archivos;

import java.nio.file.Files;
import java.nio.file.Path;

public class EscribirArchivo {
	public static void main(String [] args) {
		try {
			Path ruta = Path.of("salida.txt");
			Files.writeString(ruta, "Hola desde Java");
			System.out.println("Archivo guardado correctamente, pulsa F5");
		} catch(Exception ex) {
			System.err.println(ex.getMessage());
		} finally {
			System.out.println("FIN");
		}
	}
}
