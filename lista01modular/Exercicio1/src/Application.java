
public class Application {
	
	public static void main(String[] args) {
		Date at =  new Date();
		System.out.println("OBJETO CRIADO CONTRUTOR COM DATA ATUAL: ");
		at.imprimiData();
		Date da =  new Date(16,8,2000);
		System.out.println("\nOBJETO CRIADO CONTRUTOR PASSANDO POR PARAMETRO ");
		da.imprimiData();
		System.out.println("\n DIA ATUAL "+ at.getDay());
		System.out.println(" MES ATUAL "+ at.diasNoMes());
		System.out.println(" ANO ATUAL"+ at.getYear());
		System.out.println("\nANO BISEXTO: "+ at.eAnoBixesto(2016));
		System.out.println("\n ADICIONANDO 15 DIAS ");
		at.adicionaDias(15);
		at.imprimiData();
		System.out.println("\n ADICIONANDO 1 DIA");
		at.adicionaDias(1);
		at.imprimiData();
		
		
	}

}
