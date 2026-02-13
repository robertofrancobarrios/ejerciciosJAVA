package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaArrayTest {

	private PilaArray pila;
	
	@BeforeEach
	void setUp() {
		pila = new PilaArray();
	}

	@Test
	void testIsEmpty() {
		assertTrue(pila.isEmpty());
	}

	@Test
	void testPush() {
		pila.push(10);
		assertEquals(1, pila.size());
		assertFalse(pila.isEmpty());
	}
	
	@Test
	void testPeek() {
		pila.push(5);
		pila.push(8);
		
		assertEquals(8, pila.peek());
		assertEquals(2, pila.size());
	}
	
	@Test
	void testPop() {
		pila.push(3);
		pila.push(7);
		
		Integer eliminado = pila.pop();
		
		assertEquals(7, eliminado);
		assertEquals(3, pila.peek());
	}
	
	@Test
	void testPopPilaVacia() {
		assertThrows(IllegalStateException.class, () -> {
			pila.pop();
		});
	}
	
	@Test
	void testPeekPilaVacia() {
		assertThrows(IllegalStateException.class, () -> {
			pila.peek();
	});
	
	}

}