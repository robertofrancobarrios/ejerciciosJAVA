package Actividad10;

public class Main {
	
	
	public static void main(String[] args) {
		
		Becario becario = new Becario ("Pepito");
		
		// como Trabajador
		Trabajador t = becario;
		t.trabajar();
		
		// como Estudiante
		Estudiante e = becario;
		e.estudiar();
		
		// como Mostrable
		Mostrable m = becario;
		System.out.println(m.mostrar()); // pepito
	}
}
