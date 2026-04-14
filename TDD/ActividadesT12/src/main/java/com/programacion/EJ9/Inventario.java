package com.programacion.EJ9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Inventario {
	
	public static void main(String[] args) {
		
		Map<String, Integer> inventario = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("\n ==== INVENTARIO TIENDA ====");
			System.out.println("1. Añadir/Actualizar producto");
			System.out.println("2. Ver inventario");
			System.out.println("3. Salir");
			System.out.println("Elige una opción: ");
			opcion = sc.nextInt();
			sc.nextLine(); // para limpiar buffer
			
			switch (opcion) {
				
			case 1:
				System.out.println("Nombre del producto: ");
				String producto = sc.nextLine();
				
				System.out.println("Stock: ");
				int stock = sc.nextInt();
				sc.nextLine();
				
				// Añadir o actualizar
				inventario.put(producto, stock);
				System.out.println("Producto añadido/actualizado correctamente.");
				break;
				
			case 2:
				System.out.println("\\n--- INVENTARIO ---");
				if (inventario.isEmpty()) {
					System.out.println("No hay productos.");
				} else {
					for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
						System.out.println(entry.getKey() + " -> " + entry.getValue());
					}
				}
				
				break;
				
			case 3:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción no válida.");
			}
			
		} while (opcion != 3);
		
		sc.close();
	}

}
