
public class Linha {
	private Ponto pontoInicial;
	private Ponto PontoFinal;

	public Linha(Ponto pontoInicial, Ponto PontoFinal) {
		this.PontoFinal=PontoFinal;
		this.pontoInicial=pontoInicial;

	}

	public Ponto getPontoInicial() {
		return pontoInicial;
	}

	public void setPontoInicial(Ponto pontoInicial) {
		this.pontoInicial = pontoInicial;
	}

	public Ponto getPontoFinal() {
		return PontoFinal;
	}

	public void setPontoFinal(Ponto pontoFinal) {
		PontoFinal = pontoFinal;
	}
	
}
