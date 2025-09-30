package Actividades1;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean estaLloviendo, tareasTerminadas, biblioteca, salir;
		
		System.out.println("Está lloviendo?");
		estaLloviendo = sc.nextBoolean();
		
		System.out.println("¿Has terminado las tareas?");
		tareasTerminadas = sc.nextBoolean();
		
		System.out.println("¿Vas a la biblioteca?");
		biblioteca = sc.nextBoolean();
		
		salir = (!estaLloviendo && tareasTerminadas) || (biblioteca);
		System.out.println("Podrá salir? " + salir);
		
		

	}

}
