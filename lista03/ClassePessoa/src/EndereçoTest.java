import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EndereçoTest {

	@Test
	void testImprimirEndereço() {
		Endereço atual=new Endereço( "rua bahia",  36212405,  33200000, "Vespasiano", "MG");
		assertEquals("rua bahia",atual.getEndereco());
		assertEquals(36212405,atual.getTelefone());
		assertEquals(33200000,atual.getCep());
		assertEquals("vespasiano",atual.getCidade());
		assertEquals("MG",atual.getUF());
	}

}
