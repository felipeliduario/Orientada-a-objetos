
public class Consecionaria {
	private Veiculos[] veiculo;
	private Pe�a[] pe�a;
	private Servi�os servi�o;
	private int nota;

	public Consecionaria(Servi�os servi�o,int nota) {
		this.setNota(nota);
		this.setServi�o(servi�o);
		this.addveiculos(veiculo);
		this.addPe�a(pe�a);
	}

	private void addPe�a(Pe�a[] pe�a) {
	}

	private void addveiculos(Veiculos[] veiculo) {
	}
	

	public Pe�a[] getPe�a() {
		return pe�a;
	}

	public void setPe�a(Pe�a[] pe�a) {
		this.pe�a = pe�a;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Veiculos[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculos[] veiculo) {
		this.veiculo = veiculo;
	}

	public Servi�os getServi�o() {
		return servi�o;
	}

	public void setServi�o(Servi�os servi�o) {
		this.servi�o = servi�o;
	}
   public int GeraNotaFiscal() {
		return nota=servi�o.getValor() + Pe�a.getValor();
	}
}
