package es.iescamas.Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTareas {

	public static void main(String[] args) {
		Tarea t1 = new Tarea(1, "Crear formulario", "Programación", "pendiente");
		Tarea t2 = new Tarea(2, "Leer archivo", "Entornos", "hecha");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("tareas.txt"))) {
			
			writer.write(t1.toLinea());
			writer.newLine();
			writer.write(t2.toLinea());
			writer.newLine();
			
			System.out.println("Tareas guardadas correctamente.");
			
		} catch (IOException ex) {
			System.out.println("Error al guardar tareas: " + ex.getMessage());
		}

	}

}
