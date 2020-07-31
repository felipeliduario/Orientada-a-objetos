
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	private String Ecivil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String isSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEcivil() {
		return Ecivil;
	}

	public void setEcivil(String ecivil) {
		Ecivil = ecivil;
	}

	public Pessoa(String nome, int idade, String sexo, String ecivil) {
		this.setEcivil(ecivil);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setNome(nome);
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", Ecivil=" + Ecivil + "]";
	}
	
}
