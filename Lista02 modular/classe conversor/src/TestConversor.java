import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConversor {
  Conversor teste=new Conversor();
  
	@Test
	void testconverterPesParaMetros() {
		assertEquals(3.048,teste.converterPesParaMetros(10));
	}
  @Test
	void testconverterPesParaPolegadas() {
		assertEquals(120,teste.converterPesParaPolegadas(10));
	}
	@Test
	void testconverterPesParaCentimetros() {
		assertEquals(304.8,teste.converterPesParaCentimetros(10));
	}
	@Test
	void testconverterPolegadasParaMetros() {
		assertEquals(2.54,teste.converterPolegadasParaMetros(100));
	}
	@Test
	void testconverterPolegadasParaPes() {
		assertEquals(8.33,teste.converterPolegadasParaPes(100));
	}
	@Test
	void testconverterPolegadasParaCentimetros() {
		assertEquals(25.4,teste.converterPolegadasParaCentimetros(10));
	}
	@Test
	void testconverterMetrosParaCentimetros() {
		assertEquals(1000,teste.converterMetrosParaCentimetros(10));
	}
	@Test
	void testconverterCentimetrosParaPes() {
		assertEquals(3.9400000000000004,teste.converterCentimetrosParaPes(10));
	}
	@Test
	void testconverterCentimetrosParaMetros() {
		assertEquals(1,teste.converterCentimetrosParaMetros(100));
	}
}
