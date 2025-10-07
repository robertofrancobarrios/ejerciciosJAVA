package com;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Introduce un número, y contaré todos los numeros anteriores hasta llegar a ese número.");
		int numero = sc.nextInt();
		
		for (int i=0; i<= numero; i++) {
			System.out.println(i);
		}
				
	}
}
