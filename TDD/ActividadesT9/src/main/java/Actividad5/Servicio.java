package Actividad5;

public class Servicio implements Descuentable{
	
	private String descripcion;
    private double tarifa;

    public Servicio(String descripcion, double tarifa) {
        this.descripcion = descripcion;
        this.tarifa = tarifa;
    }

    @Override
    public double precioBase() {
        return tarifa;
    }

    @Override
    public String toString() {
        return "Servicio: " + descripcion;
    }
}