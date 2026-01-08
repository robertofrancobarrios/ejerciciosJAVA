package es.dni;
import java.util.Random;

public class ControladorDNI {
	private final char[] LETRAS = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private final int DIVISOR = 23;
	private final int LONGITUD_NUMERO_DNI = 8;
	private final int LONGITUD_DNI_COMPLETO = 9;
	
	
	private char calcularLetra(String numeroDNI) {
		if (numeroDNI == null) {
			throw new IllegalArgumentException ("El número introducido no puede ser null)");
		}
		if (numeroDNI.length() != LONGITUD_NUMERO_DNI) {
			throw new IllegalArgumentException ("El tamaño del número introducido no corresponde");
		}
		
		int num = Integer.parseInt(numeroDNI);
		return LETRAS [num%DIVISOR];
		
		
	}
	
	public char [] getLETRAS() {
		return LETRAS;
	}
	
	public boolean esValido(String dniCompleto) {
		
		char letra = dniCompleto.charAt(8);
		String dni_sin_letra = dniCompleto.substring(0,8);
		System.out.println(letra + " " + dni_sin_letra);
		return calcularLetra(dni_sin_letra) == Character.toUpperCase(letra);
	}
	
	String generarAleatorioDNI() {
		Random dni_aleatorio = new Random();
		int numero = dni_aleatorio.nextInt(100000000);
		String numeroDNI = String.format("%08d", numero);
		char letra = calcularLetra(numeroDNI);
		return (numeroDNI + letra);
		
	}
}


