package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConjuntoArrayTest {

	private ConjuntoArray conjunto;
	
	@BeforeEach
	public void setUp() {
		conjunto = new ConjuntoArray();
	}

	@Test
	public void testAddNuevoElemento() {
		boolean resultado = conjunto.add(5);
		assertTrue(resultado);
		assertEquals(1, conjunto.size());
		assertTrue(conjunto.contains(5));
	}
	
	@Test
	public void testAddElementoRepetido() {
		conjunto.add(5);
		boolean resultado = conjunto.add(5);
		assertFalse(resultado);
		assertEquals(1, conjunto.size());
	}
	
	@Test
	public void testRemoveElementoExistente() {
		conjunto.add(10);
		boolean resultado = conjunto.removeValue(10);
		assertTrue(resultado);
		assertEquals(0, conjunto.size());
		assertFalse(conjunto.contains(10));
		
	}
	
	@Test
	public void testContains() {
		conjunto.add(7);
		assertTrue(conjunto.contains(7));
		assertFalse(conjunto.contains(100));
	}
	
	public void testVariosElementos() {
		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);
		
		assertEquals(3, conjunto.size());
		assertTrue(conjunto.contains(2));
		
		conjunto.removeValue(2);
		
		assertFalse(conjunto.contains(2));
		assertEquals(2, conjunto.size());
		
		
	}

}
