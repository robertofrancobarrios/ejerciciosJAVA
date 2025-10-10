package com;

public class Actividad6 {
	public static void main(String[] args) {
		System.out.println("Se mostrarán todos los múltiplos de 7 menores que 100: " + "\n-----------------------");
		
		for (int i = 0; i < 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
