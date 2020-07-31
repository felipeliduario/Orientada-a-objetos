
public class PessoaJuridica extends Pessoas {
	private int Cnpj;

	public PessoaJuridica() {

	}

	public PessoaJuridica(String nome,Endere�o endere�o,int Cnpj,int cod) {
		super(nome,endere�o,cod);
		this.Cnpj = Cnpj;
	}

	public int getCnp() {
		return Cnpj;
	}

	public void setCnpj(int Cnpj) {
		this.Cnpj = Cnpj;
	}
	public void ImprimePessoaJuridica() {
		System.out.println(this.Cnpj);
	}
	@Override
	public int getCod() {
		return Cnpj;
	}
}
