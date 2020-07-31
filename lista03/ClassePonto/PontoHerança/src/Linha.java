
public class Linha extends Ponto {
	int pontoInicial;
	int PontoFinal;

	public Linha(int pontoInicial, int PontoFinal) {
		this.PontoFinal=PontoFinal;
		this.pontoInicial=pontoInicial;

	}

	public int getPontoInicial() {
		return pontoInicial;
	}

	public void setPontoInicial(int pontoInicial) {
		this.pontoInicial = pontoInicial;
	}

	public int getPontoFinal() {
		return PontoFinal;
	}

	public void setPontoFinal(int pontoFinal) {
		PontoFinal = pontoFinal;
	}
	
}
