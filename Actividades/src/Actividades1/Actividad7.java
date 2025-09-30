package Actividades1;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta el radio: ");
		double radio = sc.nextDouble();
		double num_pi = Math.PI;
		double longitud = 2 * num_pi * radio;
		double area = num_pi * radio * radio;
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
	}

}
