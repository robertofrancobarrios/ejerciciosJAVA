package Actividad10;

public class Becario extends Persona implements Trabajador, Estudiante, Mostrable {

	public Becario(String nombre) {
		super(nombre);
	}

	@Override
	public void estudiar() {
		System.out.println(nombre + " está estudiando");
	}

	@Override
	public void trabajar() {
		System.out.println(nombre + " está trabajando");
	}
	
	@Override
	public String mostrar() {
		return "Becario: " + nombre; 
	}
	
	

}
