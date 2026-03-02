package es.iescamas.estructura;

public class ConjuntoArray extends ListaArray {
	
	public ConjuntoArray() {
		super();
	}
	
	public boolean add(Integer n) {
		
		if (!contains(n)) {
			addFinal(n);
			return true;
		}
		return false;
		
	}
	
	public boolean removeValue(Integer n) {
		
		int index = indexOf(n);
		
		if (index != -1) {
			remove(index);
			return true;
		}
		
		return false;
	}
	
	public boolean contains(Integer n) {
		
		return indexOf(n) != -1;
	}
}
