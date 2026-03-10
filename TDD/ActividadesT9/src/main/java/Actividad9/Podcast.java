package Actividad9;

public class Podcast implements Reproducible, Mostrable{

	private String nombre;
	private String presentador;
	private int duracion; // en minutos
	
	public Podcast(String nombre, String presentador, int duracion) {
		this.nombre=nombre;
		this.presentador=presentador;
		this.duracion=duracion;
	}
	
	// Reproducir
	
	@Override
	public void play() {
		System.out.println("Reproduciendo podcast: " + nombre);
		
	}
	
	// Pausar

	@Override
	public void pause() {
		System.out.println("Pausando podcast: " + nombre);
		
	}
	
	// Detener

	@Override
	public void stop() {
		System.out.println("Deteniendo podcast: " + nombre);
		
	}
	
	// Mostrar
	
	@Override
	public void mostrar() {
		System.out.println("Podcast - Título: " + nombre + ", Locutor: " + presentador + ", Duración: " + duracion + "m");
	}

}
