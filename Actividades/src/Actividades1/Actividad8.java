package Actividades1;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte su edad: ");
		int edad = sc.nextInt();
		boolean menorDeEdad = edad < 18;
		boolean mayorDeEdad = edad > 18;
		System.out.println("Es menor de edad: " + menorDeEdad);
		
		

	}

}
