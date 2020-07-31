

public class Ultilitario extends Veiculos {
	private double descontoDeFabrica; 
	public Ultilitario(String modelo, double preco, String cor,double descontoDeFabrica){
		super(modelo,preco,cor);
		this.descontoDeFabrica = descontoDeFabrica;
	}
	public Ultilitario(){

	}
	
	public double getDescontoDeFabrica() {
		return descontoDeFabrica;
	}
	public void setDescontoDeFabrica(double descontoDeFabrica) {
		this.descontoDeFabrica = descontoDeFabrica;
	}
	 @Override
	double getPreco() {
		preco=preco*0.90;
		return preco;
	}
	   public void imprimir() {
		   System.out.println(this.descontoDeFabrica);
		   System.out.println(this.preco);
	   }

}
