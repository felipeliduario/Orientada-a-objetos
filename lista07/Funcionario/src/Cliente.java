
public class Cliente {
	private Pessoas pessoa;
	private double credito;
	private int limite;

	public Cliente(Pessoas pessoa,double credito,int limite) {
	this.pessoa=pessoa;
	this.credito=credito;
	this.limite=limite;
	}
	
	public Pessoas getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoas pessoa) {
		this.pessoa = pessoa;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
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
