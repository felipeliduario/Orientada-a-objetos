
public class Veiculos {
	public String modelo;
	public double preco;
	public String cor;

	public Veiculos() {

	}

	public Veiculos(String modelo, double preco, String cor) {
		this.modelo = modelo;
	    this.preco=preco;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	double getPreco() {

		return preco;

	}
	   public void imprimir() {
		   System.out.println(this.cor);
		   System.out.println(this.modelo);
		   System.out.println(this.preco);
	   }

}
