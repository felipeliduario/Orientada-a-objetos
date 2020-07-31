import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class PessoaFisicaTest {

	@Test
	private void testIsBigger() {
		 PessoaFisica felipe=new PessoaFisica(141593616,19,'m');
		 assertEquals("True",felipe.Bigger());
	}
}
