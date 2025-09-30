package Actividades2;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, original;
		int um, c, d, u;
		
		System.out.println("Inserte un número entre 0 y 9.999: ");
		original = sc.nextInt();
		num = original;
		
		// Unidad
		
		u = num % 10;
		num = num / 10;
		
		// Decenas
		
		d = num % 10;
		num = num / 10;
		
		// Centenas
		
		c = num % 10;
		num = num /10;
		
		// Unidades de millar
		
		um = num % 10;
		num = num / 10;
		
		// Si el número tiene 4 cifras (um, c, d, u)
		
		 if (original < 10) { // 1 cifra
             System.out.println("El número no es capicúa (1 cifra)");
         } else if (original < 100) { // 2 cifras
             if (d == u) {
                 System.out.println("El número es capicúa.");
             } else {
                 System.out.println("El número no es capicúa.");
             }
         } else if (original < 1000) { // 3 cifras
             if (c == u) {
                 System.out.println("El número es capicúa.");
             } else {
                 System.out.println("El número no es capicúa.");
             }
         } else { // 4 cifras
             if (um == u && c == d) {
                 System.out.println("El número es capicúa.");
             } else {
                 System.out.println("El número no es capicúa.");
             }
         }
     }
}