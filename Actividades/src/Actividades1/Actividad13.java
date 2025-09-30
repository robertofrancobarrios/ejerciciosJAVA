package Actividades1;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe las notas del primer trimestre: ");
		int nota_uno = sc.nextInt();
		System.out.println("Escribe las notas del segundo trimestre: ");
		int nota_dos = sc.nextInt();
		System.out.println("Escribe las notas del tercer trimestre: ");
		int nota_tres = sc.nextInt();
		
		int nota_media = (nota_uno + nota_dos + nota_tres) / 3;
		float nota_media_decimal = (nota_uno + nota_dos + nota_tres) / 3;
		
		System.out.println("Boletín de calificaciones: " + nota_media);
		System.out.println("Expediente académico: " + nota_media_decimal);
	}

}
