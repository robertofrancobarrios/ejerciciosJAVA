package Instrumentos.Actividades8;

public class Campana extends Instrumento {

	@Override
	public void interpretar() {
		System.out.println("Campana: ");
		for (int i = 0; i < numNotas; i++) {
			System.out.print(melodia[i] + " ");
		}
		System.out.println();
		
	}
	
}
