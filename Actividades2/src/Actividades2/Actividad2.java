package Actividades2;
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Inserte un número");
		num1 = sc.nextInt();
		
		System.out.println("Inserte otro número");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			
			System.out.println("Es igual");
			
		} else {
			
			System.out.println("Son números diferentes");
		}

		

	}

}
