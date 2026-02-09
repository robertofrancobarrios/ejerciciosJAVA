package Cajas.Actividades8;

public class Caja {
	private final double ancho;
	private final double alto;
	private final double fondo;
	private final Unidades unidades;
	
	public Caja (int ancho, int alto, int fondo, Unidades u) {
		if (ancho <= 0 || alto <= 0 || fondo <= 0) {
			throw new IllegalArgumentException("Las dimensiones tienen que ser mayores que 0");
		}
		
		this.unidades = u;
		
		if (u==Unidades.CM) {
			this.ancho = ancho / 100.0;
			this.alto = alto / 100.0;
			this.fondo = fondo / 100.0;
		} else {
			this.ancho = ancho;
			this.alto = alto;
			this.fondo = fondo;
		}
	}
	
	public double getVolumen() {
		return ancho * alto * fondo;
	}
	
	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + " m, alto=" + alto + " m, fondo=" + fondo + " m, volumen=" + getVolumen() + " m³";
	}	
}

