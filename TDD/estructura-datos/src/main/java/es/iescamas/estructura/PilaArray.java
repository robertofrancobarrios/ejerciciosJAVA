package es.iescamas.estructura;

public class PilaArray extends ListaArray {
	
	public PilaArray() {
		super();
	}
	
	// Añade un elemento a la cima de la pila
	
	public void push (Integer n) {
		addFinal(n);
	}
	
	// Elimina y devuelve el último elemento
	
	public Integer pop () {
		if (isEmpty()) {
			throw new IllegalStateException("La pila está vacía");
		}
		
		return remove(size() - 1);
	}
	
	// Devuelve el último elemento sin eliminarlo
	
	public Integer peek() {
		if (isEmpty()) {
			throw new IllegalStateException("La pila está vacía");
		}
		
		return get(size() - 1);
	}
	
	// Comprueba si está vacía
	
	public boolean isEmpty() {
		
		return size() == 0;
	
	}
	
}
