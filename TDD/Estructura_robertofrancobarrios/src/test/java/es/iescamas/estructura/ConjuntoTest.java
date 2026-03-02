package es.iescamas.estructura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ConjuntoTest {

    private Conjunto c1;
    private Conjunto c2;

    @BeforeEach
    void setUp() {
        c1 = new Conjunto();
        c2 = new Conjunto();
    }

    @Test
    void testInsertarYNumeroElementos() {
        assertTrue(c1.insertar(5));
        assertTrue(c1.insertar(10));
        assertFalse(c1.insertar(5)); // no se pueden duplicar
        assertEquals(2, c1.numeroElementos());
    }

    @Test
    void testAñadirElementosDe() {
        c1.insertar(1);
        c1.insertar(2);
        c2.insertar(2);
        c2.insertar(3);
        c1.añadirElementosDe(c2);
        assertEquals(3, c1.numeroElementos());
        assertTrue(c1.pertenece(1));
        assertTrue(c1.pertenece(2));
        assertTrue(c1.pertenece(3));
    }

    @Test
    void testEliminarElemento() {
        c1.insertar(5);
        c1.insertar(10);
        assertTrue(c1.eliminarElemento(5));
        assertFalse(c1.eliminarElemento(5)); // 
        assertEquals(1, c1.numeroElementos());
        assertTrue(c1.pertenece(10));
    }

    @Test
    void testEliminarTodos() {
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c2.insertar(2);
        c2.insertar(3);
        c1.eliminarTodos(c2);
        assertEquals(1, c1.numeroElementos());
        assertTrue(c1.pertenece(1));
    }

    @Test
    void testPertenece() {
        c1.insertar(7);
        assertTrue(c1.pertenece(7));
        assertFalse(c1.pertenece(10));
    }

    @Test
    void testToString() {
        c1.insertar(1);
        c1.insertar(2);
        String str = c1.toString();
        assertTrue(str.contains("1"));
        assertTrue(str.contains("2"));
        assertTrue(str.startsWith("{") && str.endsWith("}"));
    }

    @Test
    void testMinimoMaximoMedia() {
        c1.insertar(10);
        c1.insertar(5);
        c1.insertar(15);
        assertEquals(5, c1.minimo());
        assertEquals(15, c1.maximo());
        assertEquals(10.0, c1.media());
    }

    @Test
    void testMinimoMaximoMediaVacio() {
        assertThrows(NoSuchElementException.class, () -> c1.minimo());
        assertThrows(NoSuchElementException.class, () -> c1.maximo());
        assertThrows(NoSuchElementException.class, () -> c1.media());
    }

    @Test
    void testIncluido() {
        c1.insertar(1);
        c1.insertar(2);
        c2.insertar(1);
        c2.insertar(2);
        c2.insertar(3);
        assertTrue(Conjunto.incluido(c1, c2));
        assertFalse(Conjunto.incluido(c2, c1));
    }

    @Test
    void testUnion() {
        c1.insertar(1);
        c1.insertar(2);
        c2.insertar(2);
        c2.insertar(3);
        Conjunto union = Conjunto.union(c1, c2);
        assertEquals(3, union.numeroElementos());
        assertTrue(union.pertenece(1));
        assertTrue(union.pertenece(2));
        assertTrue(union.pertenece(3));
    }

    @Test
    void testInterseccion() {
        c1.insertar(1);
        c1.insertar(2);
        c2.insertar(2);
        c2.insertar(3);
        Conjunto inter = Conjunto.interseccion(c1, c2);
        assertEquals(1, inter.numeroElementos());
        assertTrue(inter.pertenece(2));
    }

    @Test
    void testDiferencia() {
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c2.insertar(2);
        Conjunto diff = Conjunto.diferencia(c1, c2);
        assertEquals(2, diff.numeroElementos());
        assertTrue(diff.pertenece(1));
        assertTrue(diff.pertenece(3));
        assertFalse(diff.pertenece(2));
    }
}