import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class ClienteTest {
	@Test
	private void testImprimeCliente() {
		 Cliente felipe=new Cliente(15000);
		 assertEquals(15000,felipe.getLimite());
	}

}
