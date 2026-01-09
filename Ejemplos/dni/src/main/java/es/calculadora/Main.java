package es.calculadora;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10,4);
		
		
		// Realizar operaciones
		
		System.out.println("Suma: " + calc.sumar());
		System.out.println("Resta: " + calc.restar());
		System.out.println("Multiplicación: " + calc.multiplicar());
		try {
			System.out.println("División: " + calc.dividir());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // En caso de intentar dividir entre 0
		}
		
	}

}
