package com;

import java.util.Scanner;

public class Actividad2 {
	public static void mostrarNumeros(int inicio, int fin) {
		if (inicio > fin) {
			// Si el primer número es mayor, se intercambia para que el rango sea correcto
			
			int temp = inicio;
			inicio = fin;
			fin = temp;
		}
		
		for (int i = inicio; i <= fin; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        
        mostrarNumeros(num1, num2);
        
        scanner.close();
    }
}