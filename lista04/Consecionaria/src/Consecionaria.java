
public class Consecionaria {
	private Veiculos[] veiculo;
	private Peça[] peça;
	private Serviços serviço;
	private int nota;

	public Consecionaria(Serviços serviço,int nota) {
		this.setNota(nota);
		this.setServiço(serviço);
		this.addveiculos(veiculo);
		this.addPeça(peça);
	}

	private void addPeça(Peça[] peça) {
	}

	private void addveiculos(Veiculos[] veiculo) {
	}
	

	public Peça[] getPeça() {
		return peça;
	}

	public void setPeça(Peça[] peça) {
		this.peça = peça;
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

	public Serviços getServiço() {
		return serviço;
	}

	public void setServiço(Serviços serviço) {
		this.serviço = serviço;
	}
   public int GeraNotaFiscal() {
		return nota=serviço.getValor() + Peça.getValor();
	}
}
