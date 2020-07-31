import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Endere�oTest {

	@Test
	void testImprimirEndere�o() {
		Endere�o atual=new Endere�o( "rua bahia",  36212405,  33200000, "Vespasiano", "MG");
		assertEquals("rua bahia",atual.getEndereco());
		assertEquals(36212405,atual.getTelefone());
		assertEquals(33200000,atual.getCep());
		assertEquals("vespasiano",atual.getCidade());
		assertEquals("MG",atual.getUF());
	}

}
