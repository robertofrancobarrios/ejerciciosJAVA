package com;

public class Actividad11 {

	public static void main(String[] args) {
		 System.out.println("Tablas de multiplicar del 1 al 10:\n");

	        // Bucle externo para el número base de la tabla (del 1 al 10)
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Tabla del " + i + ":");

	            // Bucle interno para los multiplicadores (del 1 al 10)
	            for (int j = 1; j <= 10; j++) {
	                int resultado = i * j;
	                System.out.println(i + " x " + j + " = " + resultado);
	            }

	            System.out.println(); // Línea en blanco entre tablas
	        }
	    }
	}