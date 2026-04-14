package com.programacion.EJ8;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	public static void main(String[] args) {
		
		List<Producto> carrito = new ArrayList<>();
		
		carrito.add(new Producto("Pan", 1.20));
		carrito.add(new Producto("Leche", 0.95));
		carrito.add(new Producto("Queso", 3.50));
		
		double total = 0;
		
		// Recorrer y sumar precios
		
		for (Producto p : carrito) {
			System.out.println(p);
			total += p.getPrecio();
		}
		
		System.out.println("Total: " + total + "€" );

	}

}
