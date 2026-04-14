package es.iescamas.Archivos;

public class Tarea {
	private int id;
	private String titulo;
	private String modulo;
	private String estado;
	
	public Tarea(int id, String titulo, String modulo, String estado) {
		this.id=id;
		this.titulo=titulo;
		this.modulo=modulo;
		this.estado=estado;
	}
	
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getModulo() {
		return modulo;
	}

	public String getEstado() {
		return estado;
	}
	
	// Convierte el objeto a una sola línea de texto para guardar
	
	public String toLinea() {
		return id + ";" + titulo + ";" + modulo + ";" + estado; 
	}
	
	
}
