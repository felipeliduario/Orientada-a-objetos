

public class Empresa {
	private static int TAM_MAX = 50;
	private Endereço endereço;
	private Funcionario[] presida;
	private Cliente[] clientes;
	private Funcionario[] funcionarios;

	public Empresa(Endereço endereço, Funcionario[] presida) {
		this.endereço = endereço;
		this.clientes = new Cliente[TAM_MAX];
		this.funcionarios = new Funcionario[TAM_MAX];
		this.setFuncionarios(presida);
		this.presida = presida;
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

	public Funcionario[] getPresida() {
		return presida;
	}

	public void setPresida(Funcionario[] presida) {
		this.presida = presida;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}

}
