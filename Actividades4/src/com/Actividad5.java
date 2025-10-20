package com;

import java.util.Scanner;

public class Actividad5 {
	public static int numeroMayor (int a, int b, int c) {
		
		int numeroMayor = a;
		
		if (b > numeroMayor) {
			numeroMayor = b;
		}
		
		if (c > numeroMayor) {
			numeroMayor = c;
			
		}
		
		return numeroMayor;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta el primer número entero: ");
		int a = sc.nextInt();
		
		System.out.println("Inserta el segundo número entero: ");
		int b = sc.nextInt();
		
		System.out.println("Inserta el tercer número entero: ");
		int c = sc.nextInt();
		
		int resultado = numeroMayor(a, b, c);
		
		System.out.println("El mayor de " + a + ", " + b + " y " + c + " es: " + resultado);
		
	}
}
