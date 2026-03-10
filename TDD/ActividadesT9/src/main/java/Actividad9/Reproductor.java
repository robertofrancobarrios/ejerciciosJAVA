package Actividad9;

public class Reproductor {
	private Reproducible pistaActual;
	
	public Reproductor(Reproducible pista) {
		this.pistaActual=pista;
	}
	
	// establece pista
	public void setPista(Reproducible pista) {
		this.pistaActual=pista;
	}
	
	
	// reproducir
	
	public void play() {
		pistaActual.play();
	}
	
	// pausar
	
	public void pause() {
		pistaActual.pause();
	}
	
	// detener
	
	public void stop() {
		pistaActual.stop();
	}
}
