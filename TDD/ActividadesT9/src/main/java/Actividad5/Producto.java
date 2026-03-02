package Actividad5;

public class Producto implements Descuentable {
	
	private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double precioBase() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre;
    }
}