package Actividades2;
import java.util.Scanner;
public class Actividad5 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserte un número: ");
		
		double numero, umbral ;
		numero = sc.nextDouble();
		umbral = 0.99;
		
		if (numero == 0) {
			System.out.println("El número no es casi 0");
		
		}else if (Math.abs(numero) < umbral) {
			System.out.println("El número es casi 0");
			
		}else {
			System.out.println("El número no se acerca a 0");
			
		}
		
		
	}
}
