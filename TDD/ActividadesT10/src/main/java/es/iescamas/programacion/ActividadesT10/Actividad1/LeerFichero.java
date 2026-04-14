package es.iescamas.programacion.ActividadesT10.Actividad1;

import java.util.Scanner;

public class LeerFichero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Solicitar nombre del fichero
		
		System.out.println("Introduce el nombre del fichero: ");
		String nombre = sc.nextLine();
		
		// Si no introduce nada, usar por defecto
		
		if (nombre.isEmpty()) {
			nombre = "prueba.txt";
		}
		
		
	}

}
