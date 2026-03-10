package Actividad8;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Validable[] elementos = {
				new Usuario("pepito@ejemplo.com", "12345678"),
				new Usuario("josete@ejemplo.com", "1234"),
				new Usuario("pablitoejemplo.com", "1234657987"),
				new Reserva(LocalDate.now(), 4),
				new Reserva(LocalDate.now(), 0), // este número de personas es inválido porque es 0
				new Reserva(LocalDate.now(), 1),
				new Reserva(LocalDate.now(), 9),
				new Reserva(LocalDate.now(), 8)
		};
		
		System.out.println("====VALIDANDO ELEMENTOS====");
		for (Validable v : elementos) {
			try {
				v.validar();
				System.out.println("Válido: " + ((Mostrable)v).mostrar());
			} catch (IllegalArgumentException e) {
				System.out.println("Error de validación: " + e.getMessage());
			}
		}
		
		System.out.println("\n--- MOSTRANDO ELEMENTOS ---");
		for (Validable v : elementos) {
			System.out.println(((Mostrable)v).mostrar());
		}
	}
}
