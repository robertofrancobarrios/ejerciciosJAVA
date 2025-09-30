import java.util.Scanner;
public class actividad7_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Defino tres variables
		int num1, num2, num3;
		
		System.out.println("Inserta un número: ");
		num1 = sc.nextInt();
		System.out.println("Inserta otro número: ");
		num2 = sc.nextInt();
		System.out.println("Inserta un último número: ");
		num3 = sc.nextInt();
		
		if ((num3 > num2) && (num1 > num3)) {
			// num1 es el mayor
		System.out.println("El orden correcto es: " + num1 + "" +  num3 + ""  + num2);
			// num2 es el mayor
		} else if  ((num3 > num1) && (num2 > num3)) {
		System.out.println("El orden correcto es: " + num2 + "" + num3 + "" + num1);
			// num3 es el mayor
		} else if ((num3>num1 ) && (num2 < num1)) {
		System.out.println("El orden correcto es: " + num3 + "" + num1 + "" + num2);
		
		}
	}

}


