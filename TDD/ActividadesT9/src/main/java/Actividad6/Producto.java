package Actividad6;

public class Producto implements Valorable {

	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto (int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + " - " + nombre + " - €" + precio;
	}

}
