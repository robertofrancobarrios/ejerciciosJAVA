package es.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName ("La suma debería ser 15")
	void testSumar() {
		Calculadora calc = new Calculadora (10,5);
		assertEquals(15, calc.sumar(), "La suma es incorrecta");
	}
	
	@Test
	@DisplayName ("La resta debería ser 5")
	void testRestar() {
		Calculadora calc = new Calculadora (10,5);
		assertEquals(5, calc.restar(), "La resta es incorrecta");
	}
	
	@Test
	@DisplayName ("La multiplicación debería ser 50")
	void testMultiplicar() {
		Calculadora calc = new Calculadora (10,5);
		assertEquals(50, calc.multiplicar(), "La multiplicación es incorrecta");
		
	}
	
	@Test
	@DisplayName ("La división debería ser 2.0")
	void testDivision() {
		Calculadora calc = new Calculadora (10,5);
		assertEquals(2, calc.dividir(), "La división es incorrecta");
	}
}
