package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaArrayTest {

	private ListaArray lista;
		
		
	@BeforeEach
	void setUp() throws Exception {
		lista = new ListaArray();
	}

	@Test
	void testConstructor() {
		int resultadoEsperado = 0;
		int resultado = lista.size();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testAddFinal() {
		lista.addFinal(1);
		assertEquals(1, lista.size());
		assertEquals(1, lista.get(0));
	}
	
	@Test
	void testGet() {
		lista.addFinal(5);
		lista.addFinal(10);
		assertEquals(5, lista.get(0), "El primer elemento debe ser 5");
		assertEquals(10, lista.get(1), "El primer elemento debe ser 10");	
	}
	
	@Test
	void testRemove() {
		lista.addFinal(3);
		lista.addFinal(7);
		lista.addFinal(9);
		
		Integer eliminado = lista.remove(1);
		
		assertEquals(7, eliminado, "El elemento eliminado debe ser 7");
		assertEquals(2, lista.size(), "El tamaño debe reducirse después de eliminar");
		assertEquals(9, lista.get(1), "El elemento en índice 1 debe ser ahora 8");
	}
	
	@Test
	void testIndexOf() {
		lista.addFinal(4);
		lista.addFinal(8);
		lista.addFinal(4);
		
		assertEquals(0, lista.indexOf(4), "Debe devolver el primer índice de 4");
		assertEquals(1, lista.indexOf(8), "Debe devolver el índice de 8");
		assertEquals(-1, lista.indexOf(10), "El elemento no existe, devuelve -1");
	}

}
