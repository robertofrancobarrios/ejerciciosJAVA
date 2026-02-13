package es.iescamas.estructura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ColaArrayTest {

	private ColaArray cola;
	
	@BeforeEach
	void setUp() {
		cola = new ColaArray();
	}

	@Test
	void testIsEmpty() {
		assertTrue(cola.isEmpty());;
	}
	
	@Test
	void testEnqueue() {
		cola.enqueue(1);
		
		assertEquals(1, cola.size());
		assertFalse(cola.isEmpty());
		
	}
	
	@Test
	void testDequeue() {
		cola.enqueue(1);
		cola.enqueue(2);
		
		Integer eliminado = cola.dequeue();
		
		assertEquals(1, eliminado);
		assertEquals(1, cola.size());
		assertEquals(2, cola.first());
	}
	
	@Test
	void testFirst() {
		cola.enqueue(1);
		cola.enqueue(2);
		cola.enqueue(3);
		
		assertEquals(1, cola.first());
		assertEquals(3, cola.size());
	}
	
	@Test
	void testDequeueColaVacia() {
		assertThrows(IllegalStateException.class, () -> {
			cola.dequeue();
		});
	}
	
	void testFirstColaVacia() {
		assertThrows(IllegalStateException.class, () -> {
			cola.first();
		});
	}

}
