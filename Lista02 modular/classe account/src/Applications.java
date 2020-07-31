
public class Applications {
	public static void main(String[] args) {
		Account felipe = new Account(12345, 25000, 50000);
		int money = 2000;
		felipe.deposit(money);
		System.out.println("Foi feito um deposito de " + money + " reais na conta " + felipe.getNumAccount()
				+ ".\nO novo saldo é:" + felipe.getBalance()+" reais");
		int dinheiro=15000;
		felipe.withdraw(dinheiro);
		System.out.println("Foi feito um saque de " + dinheiro + " reais na conta " + felipe.getNumAccount()
				+ ".\nO novo saldo é:" + felipe.getBalance()+" reais");
		int emprestimo=8000;
		felipe.loan(emprestimo);
		if(emprestimo+felipe.getBalance()>felipe.getLimit()) {
			System.out.println("limite excedido.Atual limite é de "+felipe.getLimit()+" reais");
		}
		else {
		System.out.println("Foi feito um emprestimo de " + emprestimo + " reais na conta " + felipe.getNumAccount()
				+ ".\nO novo saldo é:" + felipe.getBalance()+" reais");
		
	}
	}
}
