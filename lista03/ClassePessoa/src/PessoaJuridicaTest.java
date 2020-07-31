import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PessoaJuridicaTest {

	@Test
	private void testImprimePessoaJuridica() {
		 PessoaJuridica felipe=new PessoaJuridica(141596);
		 assertEquals(141596,felipe.getCNPJ());
	}

}
