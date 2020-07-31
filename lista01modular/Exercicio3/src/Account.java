
public class Account {

	private int numAccount;
	private double Balance;
	private int limit;

	public double getBalance() {
		return Balance;
	}
	
	public void setBalance(double balance) {
		Balance = balance;
	}

	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}


	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void deposit(double money) {
		this.Balance += money;
	}

	public double withdraw(double money) {
		if(this.Balance>money){
			return this.Balance-=money;
		}
		else{
			return 0;
		}
		
	}
	public double loan(double money) {
		if(this.limit<money){
			return 0;
		}
		else{
			return this.Balance += money;
		}
	}
}
