package es.iescamas.Archivos;

import java.nio.file.Files;
import java.nio.file.Path;

public class LeerArchivo {
	public static void main(String[] args) {
		try {
			Path ruta = Path.of("salida.txt");
			String texto = Files.readString(ruta);
			System.out.println(texto);
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		} finally {
			System.out.println("FIN del programa");
		}
	}
}
