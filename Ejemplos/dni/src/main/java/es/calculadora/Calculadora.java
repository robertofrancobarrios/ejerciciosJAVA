package es.calculadora;

public class Calculadora {
	
	// Atributos
	
	private int num1;
	private int num2;

	// Métodos
	
	public int sumar () {
		return num1+num2;
	}
	
	public int restar () {
		return num1-num2;
	}
	
	public int multiplicar () {
		return num1*num2;
	}
	
	public double dividir () {
		if (num2 == 0) {
			throw new ArithmeticException ("No se puede dividir entre cero");
		}
		return (double) num1/num2;
		
	}
	
	// Constructor
	
	public Calculadora (int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
}

