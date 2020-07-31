
public class Cliente extends Pessoas {
	private int limite;

	public Cliente(int limite) {
	this.limite=limite;
	}
	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	public void imprimirCliente() {
		System.out.println(this.limite);
	}
	
}
