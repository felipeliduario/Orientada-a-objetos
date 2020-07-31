
public class PessoaFisica extends Pessoas {
	private int cpf;
	private int age;
	private char sex;

	public PessoaFisica(String nome, Endere�o endere�o, int cpf, int age, char sex, int cod) {
		super(nome, endere�o, cod);
		this.cpf = cpf;
		this.age = age;
		this.sex = sex;
	}

	public PessoaFisica() {
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean Bigger() {
		if (this.age <= 18) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int getCod() {
		return cpf;
	}
}
