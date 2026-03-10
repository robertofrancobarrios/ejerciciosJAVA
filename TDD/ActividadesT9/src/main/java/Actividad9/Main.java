package Actividad9;

public class Main {
	public static void main(String[] args) {
		
		// crear pistas
		
		Cancion c1 = new Cancion ("Cancion1", "Artista1", 180);
		Cancion c2 = new Cancion ("Cancion2", "Artista2", 175);
		Podcast p1 = new Podcast ("Podcast1", "Presentador1", 60);
		Podcast p2 = new Podcast ("Podcast2", "Presentador2", 85);
		
		// mostrar información
		
		c1.mostrar();
		c2.mostrar();
		p1.mostrar();
		p2.mostrar();
		
		System.out.println("\n==== REPRODUCIENDO PISTAS ====");
		
		// reproducir usando reproductor
		
		Reproductor reproductor = new Reproductor(c1);
		
		reproductor.play();
		reproductor.pause();
		reproductor.stop();
		
		// para cambiar pista
		
		reproductor.setPista(p2);
		reproductor.play();
		
		// guardar varias pistas en Reproducible[] y cambiar el elemento actual por índice
		
		Reproducible[] playlist = {c1, c2, p1, p2};
		
		System.out.println("\n==Reproducir playlist por índice==");
		
		for (int i=0; i < playlist.length; i++) {
			System.out.println("Indice: " + i);
			reproductor.setPista(playlist[i]);
			reproductor.play();
		}
	}
}
