import java.util.ArrayList;

public class Empresa {
	private static int TAM_MAX = 50;
	private Endereço endereço;
	ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	private Cliente[] clientes;

	
	public Empresa(Endereço endereço, ArrayList<Funcionario> listaFuncionario, Cliente[] clientes) {
		super();
		this.endereço = endereço;
		this.listaFuncionario = listaFuncionario;
		this.clientes = clientes;
	}

	public static int getTAM_MAX() {
		return TAM_MAX;
	}

	public static void setTAM_MAX(int tAM_MAX) {
		TAM_MAX = tAM_MAX;
	}

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public void addFuncionario(Funcionario f) {
		this.listaFuncionario.add(f);
	}

	public void removeFuncionario(Funcionario f) {
		this.listaFuncionario.remove(f);
	}

}
