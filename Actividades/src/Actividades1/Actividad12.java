package Actividades1;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un número ");
		
		int numero = sc.nextInt();
		int absoluto = Math.abs(numero);
		
		System.out.println("Su valor absoluto es: " + absoluto);
		
		

	}

}
