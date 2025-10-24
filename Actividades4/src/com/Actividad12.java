package com;

public class Actividad12 {
	// Diseñar la función calculadora(a, b, op) suma, resta, producto, división a la que se le pasan dos enteros (operandos) y la operación a realizar: 1 suma, 2 resta, 3 multiplicación, 4 división. La función devolverá un número real como resultado.
	
	public static void main(String[] args) throws Exception {
		System.out.println(Calculadora(3, 2, 3));
	}
	
	
	
	
	public static double Calculadora (int a, int b, int operacion) throws Exception {
		
		double resultado = 0;
		
		switch (operacion) {
		
		case 1: 
			resultado = a + b; 
			break;
			
		case 2:
			resultado = a - b;
			break;
			
		case 3:
			resultado = a * b;
			break;
			
		case 4:
			if(b != 0) {
				resultado = (double) a / b;
				
			} else {
				throw new Exception("No existe la operación indicada");
			}
			break;
			
		default:
			throw new Exception("No existe la operación indicada");
			
		}
		return resultado;
	}
		
		
		
		
		
		
		
		
	}
	
