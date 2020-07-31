
public class Veiculos {
	private int ano;
	private String cor;
	private String modelo;

	public Veiculos(int ano, String cor, String modelo) {
		this.setAno(ano);
		this.setCor(cor);
		this.setModelo(modelo);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
