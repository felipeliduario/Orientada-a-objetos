
public class Endereço {
	private String endereco;
	private int telefone;
	private int cep;
	private String cidade;
	private String UF;
	public Endereço(String endereco, int telefone, int cep,String cidade,String UF) {
		this.endereco=endereco;
		this.cep=cep;
		this.telefone=telefone;
		this.cidade=cidade;
		this.UF=UF;
	}
	public Endereço() {
		
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public void ImprimirEndereço() {
		System.out.println(this.endereco);
		System.out.println(this.UF);
		System.out.println( this.cep);
		System.out.println( this.telefone);
		System.out.println(this.cidade);
	}
	
}
