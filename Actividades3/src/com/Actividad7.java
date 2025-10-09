package com;

public class Actividad7 {
	public static void main(String[] args) {
		int producto = 1;
		int contador = 0;
		int numero = 1;
		
		while (contador < 10) {
				producto *= numero;
				numero += 2;
				contador ++;
			}
		System.out.println("El producto de los 10 primeros numeros impares es: " + producto);
		}
	} 

