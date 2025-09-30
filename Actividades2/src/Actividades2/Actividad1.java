package Actividades2;
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta un número: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Es par");
		
		} else {
			System.out.println("Es impar");
		}

	}

}
