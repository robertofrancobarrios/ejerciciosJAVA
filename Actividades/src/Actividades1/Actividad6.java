package Actividades1;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta la primera nota");
		float primera_nota = sc.nextFloat();
		System.out.println("Inserta la segunda nota");
		float segunda_nota = sc.nextFloat();
		float resultado = (primera_nota + segunda_nota) / 2;
		System.out.println("La media es: " + resultado);
	}

}
