
public class AgenciaDeVeiculo {

	public static void main(String[] args) {
		Caminhao palio=new Caminhao("palio",100,"branco",2000);
		Veiculos veiculos=palio;
		System.out.println(veiculos.getPreco());
	}

}
