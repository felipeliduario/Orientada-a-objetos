
public class PessoaJuridica extends Pessoas {
	private int CNPJ;

	public PessoaJuridica() {

	}

	public PessoaJuridica(int CNPJ) {
		this.CNPJ = CNPJ;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public void ImprimePessoaJuridica() {
		System.out.println(this.CNPJ);
	}
}
