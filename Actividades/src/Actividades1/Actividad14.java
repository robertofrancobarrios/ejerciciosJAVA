package Actividades1;
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numerodecimal, numeroredondeado;
		
		System.out.println("Inserta un número decimal: ");
		
		numerodecimal = sc.nextDouble();
		numeroredondeado = Math.round(numerodecimal);
		
		System.out.println("El número redondeado es: " + numeroredondeado);

	}

}
