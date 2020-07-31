
public class Application {
	public static void main(String[] args) {
	Pessoas felipe=new Pessoas();
	PessoaFisica f=new PessoaFisica();
	felipe=f;
	System.out.println(felipe.getCod());
	}
}
