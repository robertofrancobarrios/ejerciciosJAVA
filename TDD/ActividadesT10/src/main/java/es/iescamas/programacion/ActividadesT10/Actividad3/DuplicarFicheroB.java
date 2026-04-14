package es.iescamas.programacion.ActividadesT10.Actividad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DuplicarFicheroB {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero a duplicar: ");
		String ficheroOrigen = sc.nextLine();
		
		String ficheroDestino = "copia_de_" + ficheroOrigen;
		
		try (BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
				FileWriter fw = new FileWriter(ficheroDestino, false)) {
			
			String linea;
			while ((linea = br.readLine()) != null) {
				fw.write(linea + "\n");
			}
			
			System.out.println("Fichero duplicado correctamente en " + ficheroDestino);
			
		} catch (IOException e) {
			System.out.println("Error al duplicar el fichero: " + e.getMessage());
		}
		
		sc.close();
	}
}
