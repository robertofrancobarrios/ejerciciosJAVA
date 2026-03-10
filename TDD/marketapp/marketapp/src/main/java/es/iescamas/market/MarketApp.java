package es.iescamas.market;

import es.iescamas.market.interfaces.Descuentable;
import es.iescamas.market.interfaces.Enviable;

/**
 * MarketApp
 * ---------
 * Utilidad “de negocio” para practicar TDD con:
 *  - Interfaces (Descuentable, Enviable)
 *  - Comparable (orden natural en Producto)
 *  - Comparator (criterios alternativos)
 *  - Tablas (arrays) + ordenación manual (burbuja)
 *
 * ⚠️ Importante para la práctica:
 * - NO se usan colecciones (List/ArrayList/Streams).
 * - La mayoría de métodos devuelven una NUEVA tabla para no modificar el original.
 * - Los tests deben guiar la implementación (TDD).
 */
public class MarketApp {

	public double precioFinal(Descuentable p, double precioBase) {
		
		return precioBase * (1 - p.getPorcentajeDescuento());
	}

	public double costeEnvio(Enviable p) {
		
	    if (p.getPesoKg() <= 0) throw new IllegalArgumentException("peso invalido");
	    return 2.99 + (p.getPesoKg() * 1.20); //
	}

	public Producto[] copiar(Producto[] original) {
		Producto[] copia = new Producto[original.length];
		
		for (int i=0; i < original.length; i++) {
			copia[i] = original[i];
		}
		
		return copia;
	}

	public Producto[] ordenarNatural(Producto[] original) {
		Producto[] copia = copiar(original);
		
		for (int i= 0; i < copia.length -1; i++) {
			for (int j=0; j < copia.length -1; j++) {
				if (copia[j].compareTo(copia[j+1]) > 0) {
					Producto temp = copia[j];
					copia[j+1] = temp;
				}
			}
		}
		return copia;
	}

}
