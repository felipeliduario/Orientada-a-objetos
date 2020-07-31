
public class SUV extends Veiculos {
	private int comprimento ; 
	public SUV(String modelo, double preco, String cor,int comprimento){
		super(modelo,preco,cor);
		this.comprimento=comprimento;
	}
	public SUV(){
		
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	 @Override
	double getPreco() {
		if (comprimento > 6) {
			preco = preco * 0.9;
		} else {
			preco = preco * 0.8;
		}
		return preco;
	} 
   public void imprimir() {
	   System.out.println(this.comprimento);
	   System.out.println(this.preco);
   }
}
