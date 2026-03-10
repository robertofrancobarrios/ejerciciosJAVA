package Actividad8;

import java.time.LocalDate;

public class Reserva implements Validable, Mostrable {

	private LocalDate fecha;
	private int numPersonas;
	
	public Reserva(LocalDate fecha, int numPersonas) {
		this.fecha=fecha;
		this.numPersonas=numPersonas;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if (numPersonas <= 0) throw new IllegalArgumentException("ERROR: El número de personas debe ser mayor que 0 "); 
		
	}
	
	@Override
	public String mostrar() {
		
		return "Reserva [fecha= " + fecha + ", numPersonas=" + numPersonas + "]";
	}
}
