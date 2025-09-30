package Actividades1;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int num = sc.nextInt();
		boolean esPar = (num % 2 == 0);
		System.out.println("¿Es par? " + esPar);
		
	}

}
