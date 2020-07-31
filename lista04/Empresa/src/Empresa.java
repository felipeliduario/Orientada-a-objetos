

public class Empresa {
	private static int TAM_MAX = 50;
	private Endere�o endere�o;
	private Funcionario[] presida;
	private Cliente[] clientes;
	private Funcionario[] funcionarios;

	public Empresa(Endere�o endere�o, Funcionario[] presida) {
		this.endere�o = endere�o;
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

	public Endere�o getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
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
