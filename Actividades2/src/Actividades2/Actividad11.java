package Actividades2;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota;
		System.out.println("Inserte su nota: ");
		nota = sc.nextDouble();
		
		if (nota >= 0 && nota < 5) {
			System.out.println("Su nota es insuficiente.");
		} else if (nota > 5 && nota < 6) {
			System.out.println("Su nota es suficiente.");
		} else if (nota > 6 && nota < 8) {
			System.out.println("Su nota es notable.");
		} else if (nota > 8 && nota <= 10) {
			System.out.println("Su nota es sobresaliente.");
		}
		

	}

}
