package es.iescamas.programacion.ActividadesT10.Actividad2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarDatos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Pedir datos al usuario
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce tu edad: ");
		Integer edad = sc.nextInt();
		
		try {
			// FileWriter en modo sobreescritura (borra contenido si existe)
			FileWriter writer = new FileWriter("datos.txt", false);
			
			// Escribir datos en el fichero
			writer.write("Nombre : " + nombre + "\n");
			writer.write("Edad: " + edad + "\n");
			
			writer.close();
			
			System.out.println("Datos guardados correctamente en datos.txt");
			
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
		
		sc.close();
	}

}
