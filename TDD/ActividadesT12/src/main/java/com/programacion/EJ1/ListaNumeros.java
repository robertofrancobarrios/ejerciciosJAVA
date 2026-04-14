package com.programacion.EJ1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumeros {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Integer num_aux;
				
		// Solicito los números
		for (int i=0; i<10; i++) {
			System.out.println("Dime un número: ");
			num_aux = sc.nextInt();
			lista.add(num_aux);
		}
		
		mostrar_valores(lista);
		calcula_suma(lista);
		calcula_media(lista);
		
	}

	private static void calcula_media(List<Integer> lista) {
		int suma = 0;
		
		for (Integer num : lista) {
			suma += num;
			
		}
		
		double media = (double) suma / lista.size();
		System.out.println("La media es: " + media);
		
	}

	private static void calcula_suma(List<Integer> lista) {
		int suma=0;
		
		for (Integer num : lista) {
			suma += num;
		}
		System.out.println("La suma es: " + suma);
		
	}

	private static void mostrar_valores(List<Integer> lista) {
		
		System.out.println("Valores introducidos: ");
		
		for (Integer num : lista) {
			System.out.println(num);
		}
		
		
	}
}
