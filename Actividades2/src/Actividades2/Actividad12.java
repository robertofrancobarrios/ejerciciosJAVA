package Actividades2;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anio;
		
		// Pedimos el día
		System.out.println("Introduce el día: ");
		dia = sc.nextInt();
		
		// Pedimos el mes
		System.out.println("Introduce el mes: ");
		mes = sc.nextInt();
		
		// Pedimos el año
		System.out.println("Introduce el año: ");
		anio = sc.nextInt();
		
		// Validación de rango de mes y año
		
		
		int diasMaximos; 
		switch (mes) {
			case 1: // Enero
			case 3: // Marzo
			case 5: // Mayo
			case 7: // Julio
			case 8: // Agosto
			case 10: // Octubre
			case 12: // Diciembre
				diasMaximos = 31;
				break;
			case 4: // Abril
			case 6: // Junio
			case 9: // Septiembre
			case 11: // Noviembre
				diasMaximos = 30;
				break;
			case 2: // Febrero
				diasMaximos = 28;
				break;
			default:
				return false; // Caso imposible por la validación inicial del mes
				
		}
	
		// Para validar el día
		return dia >=1 && dia <= diasMaximos
	}

}
