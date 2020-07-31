import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	private void testImprimePessoa() {
		 Pessoas felipe=new Pessoas("felipe");
		 assertEquals("felipe",felipe.getName());
	}
	
}
