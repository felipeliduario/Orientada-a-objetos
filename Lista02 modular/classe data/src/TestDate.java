import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class TestDate {
	Date data = new Date();

	@Test
	public void testAdicionaDia() {
		data.adicionaDias(15);
		assertEquals(20, data.getDay());
	}
	@Test
	public void testProximoDia(){
		data.proximoDia(1);
		assertEquals(06, data.getDay());
	}
	@Test
	public void testDiasNoMes(){
		assertEquals(30, data.diasNoMes());
	}
	@Test
	public void testEAnoBixesto(){
		assertFalse(data.eAnoBixesto());
	}
	@Test
	public void testPorExtenso(){
		assertEquals("5 de Setembro de 2019",data.porExtenso());
	}
}
