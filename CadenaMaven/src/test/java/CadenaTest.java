

import static org.junit.jupiter.api.Assertions.*;

import org.cuatrovientos.ed20_cadena.Cadena;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest {

	private Cadena target;
	
	@BeforeEach
	void setUp() throws Exception {
		target = new Cadena();
	}

	@Test
	void testLongitud1() {
		int expected = 4;
		int actual = target.longitud("hola");
		assertEquals(expected, actual, "longitud de la cadena");
	}
	
	@Test
	void testLongitud2() {
		int expected = 0;
		int actual = target.longitud("");
		assertEquals(expected, actual, "longitud de la cadena");
	}
	
	@Test
	void testVocales1() {
		int expected = 2;
		int actual = target.vocales("hola");
		assertEquals(expected, actual, "longitud de la cadena");
	}
	
	@Test
	void testVocales2() {
		int expected = 0;
		int actual = target.vocales("");
		assertEquals(expected, actual, "numero de vocales en la cadena");
	}
	
	@Test
	void testInvertir1() {
		String expected = "soidA";
		String actual = target.invertir("Adios");
		assertEquals(expected, actual, "cadena invertida");
	}
	
	@Test
	void testInvertir2() {
		String expected = "";
		String actual = target.invertir("");
		assertEquals(expected, actual, "cadena invertida");
	}
	
	@Test
	void testContarLetra1() {
		int expected = 2;
		int actual = target.contarLetra("Hola mundo", 'o');
		assertEquals(expected, actual, "Numero de veces que aparece una letra en la cadena");
	}
	
	@Test
	void testContarLetra2() {
		int expected = 0;
		int actual = target.contarLetra("", 'o');
		assertEquals(expected, actual, "Numero de veces que aparece una letra en la cadena");
	}
	
}
