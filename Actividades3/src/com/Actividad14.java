package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Introduce un número n: ");
		        int n = sc.nextInt();
		        
		        for (int i = 0; i < n; i++) {
		            // Para cada fila, imprimir (n - i) asteriscos
		            for (int j = 0; j < n - i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println(); // salto de línea después de cada fila
		        }
		        
		        sc.close();
		    }
		}