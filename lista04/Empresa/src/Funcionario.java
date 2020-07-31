
public class Funcionario extends PessoaFisica {
	private int salario;
	private String cargo;

	public Funcionario() {

	}

	public Funcionario(int salario, String cargo) {
		this.salario=salario;
		this.cargo=cargo;

	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void ImprimeFunc() {
		System.out.println(this.cargo);
		System.out.println(this.salario);
	}
	
}
