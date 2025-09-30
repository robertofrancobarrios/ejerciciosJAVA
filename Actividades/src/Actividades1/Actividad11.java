package Actividades1;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double PRECIO_MANZANA = 2.35;
		final double PRECIO_PERAS = 1.95;
				
		System.out.println("Ingresa las ventas de manzanas en kilos del primer semestre:");
		double ventasManzanasprimersemestre = sc.nextDouble();
		
		System.out.println("Ingresa las ventas de manzanas en kilos del segundo semestre:");
		double ventasManzanassegundosemestre = sc.nextDouble();
		
		System.out.println("Ingresa las ventas de peras en kilos del primer semestre:");
		double ventasPerasprimersemestre = sc.nextDouble();
		
		System.out.println("Ingresa las ventas de peras en kilos del segundo semestre:");
		double ventasPerassegundosemestre = sc.nextDouble();
		
		double totalmanzanasbeneficios = PRECIO_MANZANA * (ventasManzanasprimersemestre + ventasManzanassegundosemestre);
		double totalperasbeneficios = PRECIO_PERAS * (ventasPerasprimersemestre + ventasPerassegundosemestre);
		
		double totalbeneficios = totalmanzanasbeneficios + totalperasbeneficios;
		
		System.out.println("Beneficios con manzanas son: " + totalmanzanasbeneficios);
		System.out.println("Beneficios con peras son: " + totalperasbeneficios);
		System.out.println("Beneficios totales: " + totalbeneficios);
		
	}

}
