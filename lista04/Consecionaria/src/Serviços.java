
public class Servi�os {
	private String Tipo;
	private int Valor;

	public Servi�os(String tipo, int Valor) {
		this.setTipo(tipo);
		this.setValor(Valor);
	}

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
}
