
public class Peça {
	private String tipo;
	private static int Valor;
	private int Garantia;

	public Peça(String tipo, int Valor, int Garantia) {
		this.setTipo(tipo);
		this.setValor(Valor);
		this.setGarantia(Garantia);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	public int getGarantia() {
		return Garantia;
	}

	public void setGarantia(int garantia) {
		Garantia = garantia;
	}
	
}
