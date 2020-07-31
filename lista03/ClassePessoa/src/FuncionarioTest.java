import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class FuncionarioTest {

	@Test
	private void testImprimeFunc() {
		 Funcionario felipe=new Funcionario(1500,"GERENTE");
		 assertEquals(1500,felipe.getSalario());
		 assertEquals("GERENTE",felipe.getCargo());
	}
}
