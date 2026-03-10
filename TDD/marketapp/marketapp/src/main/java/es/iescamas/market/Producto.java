package es.iescamas.market;
import es.iescamas.market.interfaces.Descuentable;
import es.iescamas.market.interfaces.Enviable;

/**
 * Representa un producto del catálogo de la aplicación Market.
*/
public class Producto implements Descuentable, Enviable, Comparable<Producto>{


    private String categoria;
	private String nombre;
	private String sku;
	private double precio;
	private double rating;
	private int stock;
	private int ventas;
	private double porcentajeDescuento;
	private double pesoKg;

	/**
     * Construye un producto con todos sus datos.
     *
     * @param sku código único del producto (SKU)
     * @param nombre nombre comercial del producto
     * @param categoria categoría del producto (puede ser {@code null})
     * @param precio precio base del producto (sin descuentos aplicados)
     * @param rating valoración media del producto (p.ej., 0.0..5.0)
     * @param stock unidades disponibles en almacén
     * @param ventas unidades vendidas (para ordenar por “popularidad”)
     * @param porcentajeDescuento descuento en tanto por uno (0.0..1.0)
     * @param pesoKg peso en kilogramos (0.0 si no es enviable; para envío debe ser &gt; 0)
     */
    public Producto(
            String sku,
            String nombre,
            String categoria,
            double precio,
            double rating,
            int stock,
            int ventas,
            double porcentajeDescuento,
            double pesoKg
    ) {
        this.sku = sku;
        this.nombre= nombre;
        this.categoria= categoria;
        this.precio= precio;
        this.rating= rating;
        this.stock= stock;
        this.ventas= ventas;
        this.porcentajeDescuento = porcentajeDescuento;
        this.pesoKg = pesoKg;
        
    }

	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}

	@Override
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	@Override
	public double getPesoKg() {
		// TODO Auto-generated method stub
		return pesoKg;
	}

	@Override
	public int compareTo(Producto otro) {
	   
		// ventas descendente
		
	    if (this.ventas != otro.ventas) {
	        return otro.ventas - this.ventas;
	    }
	    
	    // rating descendente
	    
	    if (Double.compare(otro.rating, this.rating) != 0) {
	        return Double.compare(otro.rating, this.rating);
	    }
	    
	    return this.sku.compareTo(otro.sku);
	   
	}
	
	public String getSku() {
		return sku;
	}
	
}
