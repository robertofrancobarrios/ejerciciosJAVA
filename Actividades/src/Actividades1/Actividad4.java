package Actividades1;
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuál es el año actual?");
		int year_actual = sc.nextInt();
		System.out.println("¿Cuál es tu año de nacimiento?");
		int year_nacimiento = sc.nextInt();
		int edad = year_actual - year_nacimiento;
		System.out.print("Tu edad es: " + edad + " años");
	}

}
