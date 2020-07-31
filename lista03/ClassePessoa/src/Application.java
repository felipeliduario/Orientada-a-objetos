
public class Application {
	public static void main(String[] args) {
		PessoaFisica pessoa = new PessoaFisica(160820019, 19, 'm');
		System.out.println("Ja pode dirigir? " + pessoa.Bigger());
		System.out.println("\nIDADE:" + pessoa.getAge() + " \nCPF:" + pessoa.getCpf() + " \nSEXO: " + pessoa.getSex());
	}
}
