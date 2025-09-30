package Actividades2;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Dime un número");
		num1 = sc.nextInt();
		
		System.out.println("Dime otro número");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("El mayor número es: " + num1);
			
		} else if (num1 == num2) {
			System.out.println("Los números son iguales ");
		} else {
			System.out.println("El mayor número es: " + num2);
		}
	}

}
