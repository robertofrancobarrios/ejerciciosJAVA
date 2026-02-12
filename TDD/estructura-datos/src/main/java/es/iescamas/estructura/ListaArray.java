package es.iescamas.estructura;

public class ListaArray {
	
	// Atributos
	
	private Integer[] tabla;
	private int numElementos;
	
	// Constructor
	public ListaArray() {
		tabla = new Integer[10];
		this.numElementos = 0;
	}
	
	//Devuelve el número de elementos
	public int size() {
		return numElementos;
	}
	
	//Añade al final un elemento
	public void addFinal (Integer n) {
		if (numElementos == tabla.length) {
			ampliarTabla();
		}
		tabla[numElementos] = n;
		numElementos++;
	}
	
	//Para obtener el elemento en una posición
	public Integer get(int index) {
		if (index < 0 || index > numElementos) {
			throw new IllegalArgumentException("Fuera de rango");
		}
		
		return tabla[index];
		
	}
	
	// Elimina y devuelve el elemento de una posición
	
	public Integer remove(int index) {
		if (index < 0 || index > numElementos) {
			throw new IllegalArgumentException("Fuera de rango");
		}
		
		Integer eliminado = tabla[index];
		
		for (int i = index; i < numElementos; i++) {
			tabla[i] = tabla [i + 1];
		}
		
		tabla[numElementos - 1] = null;
		numElementos--;
		
		return eliminado;
		
	}
	
	// Devuelve el índice de un elemento
	
	public int indexOf(Integer n) {

        for (int i = 0; i < numElementos; i++) {
            if (tabla[i].equals(n)) {
                return i;
            }
        }
        return -1;
    }
	
	// Convierte la lista a String
	
	@Override
	public String toString() {
		String resultado = "[";
		
		for (int i = 0; i < numElementos; i++) {
			resultado += tabla[i];
			if (i < numElementos -1) {
				resultado += ", ";
			}
		}
		
		resultado += "]";
		return resultado;
	}
	
	
	
	// Método ampliar tabla

	private void ampliarTabla() {
		Integer[] nuevaTabla = new Integer [tabla.length * 2];
		
		for (int i = 0; i < tabla.length; i++) {
			nuevaTabla[i] = tabla[i];
		}
		
		tabla = nuevaTabla;
	}

	public Integer[] getTabla() {
		return tabla;
	}
	
	
	
	
}
