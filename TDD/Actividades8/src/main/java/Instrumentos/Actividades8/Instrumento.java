package Instrumentos.Actividades8;

public abstract class Instrumento {
	final int MAX = 100;
	protected Nota[] melodia = new Nota[100]; // protegido array
	protected int numNotas; // protegido
	
	// añade nota al final (true si se puede añadir)
	
	public boolean add(Nota n) {
		if (numNotas < melodia.length) {
			melodia[numNotas] = n;
			numNotas++;
			return true;
		}
		
		return false; // si no hay más espacio, no se añade nota
	}
	
	public abstract void interpretar();
}
