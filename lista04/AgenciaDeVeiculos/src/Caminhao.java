
public class Caminhao extends Veiculos {

	private int carga;

	public Caminhao(String modelo, double preco, String cor,int carga) {
		super(modelo,preco,cor);
		this.carga=carga;
	}

	public Caminhao() {

	}
	

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
   @Override
	double getPreco() {
		if (carga > 2000) {
			preco = preco * 1.1;
		} else {
			preco = preco * 1.2;
		}
		return preco;
	}
	   public void imprimir() {
		   System.out.println(this.carga);
		   System.out.println(this.preco);
	   }
}
