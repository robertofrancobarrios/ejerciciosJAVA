package Actividades1;
import java.util.Scanner;
public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		System.out.println("La edad del usuario será: " + (edad+1));
	}

}
