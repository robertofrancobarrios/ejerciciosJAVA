package es.iescamas.estructura;

public class ColaArray extends ListaArray{
	
	public ColaArray() {
		super();
	}
	
	// Añadir al final de la cola
	
	public void enqueue (Integer n) {
		
		addFinal(n);
	}
	
	// Elimina y devuelve el primer elemento
	
	public Integer dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("La cola está vacía");
		}
		
		return remove(0);
	}
	
	// Devuelve el primer elemento sin eliminarlo
	
	public Integer first() {
		if (isEmpty()) {
			throw new IllegalStateException("La cola está vacía");
		}
		
		return get(0);
	}
	
	// Muestra si la cola está vacía
	
	public boolean isEmpty() {
		return size() == 0;
	}
}
