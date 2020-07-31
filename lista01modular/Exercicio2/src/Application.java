
public class Application {
	public static void main(String[] args) {
		Person pes = new Person("Felipe",160820019,19,'m');
		System.out.println("Ja pode dirigir? "+ pes.Bigger());
		System.out.println("\nIDADE:"+ pes.getAge()+" \nCPF:"+pes.getCpf()+ " \nSEXO: "+ pes.getSex()+ " \nNOME: "+ pes.getName());
		}
}
