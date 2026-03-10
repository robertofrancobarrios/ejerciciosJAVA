package Actividad9;

public class Cancion implements Reproducible, Mostrable {

	private String titulo;
	private String artista;
	private int duracion; // en segundos
	
	public Cancion(String titulo, String artista, int duracion) {
		this.titulo=titulo;
		this.artista=artista;
		this.duracion=duracion;
	}
	
	// Reproducir
	
	@Override
	public void play() {
		System.out.println("Reproduciendo: " + titulo);
		
	}
	
	// Pausar
	
	@Override
	public void pause() {
		System.out.println("Pausada: " + titulo);
		
	}
	
	// Detener

	@Override
	public void stop() {
		System.out.println("Detenida: " + titulo);
		
	}
	
	// Mostrar
	
	@Override
	public void mostrar() {
		System.out.println("Canción - Título: " + titulo + ", Artista: " + artista + ", Duración: " + duracion + "s");

	}

}
