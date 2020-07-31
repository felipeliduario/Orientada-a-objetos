import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccount {
 
	@Test
	public void testDeposit() {
		Account Bradesco=new Account(01234, 0, 1500);
		Bradesco.deposit(150);
		assertEquals(150,Bradesco.getBalance());
	}
	@Test
	public void testWithDraw() {
		Account Bradesco=new Account(01234, 150, 1500);
		Bradesco.withdraw(100);
		assertEquals(50,Bradesco.getBalance());
	}
	@Test
	public void testSufficientBalance() {
		Account Bradesco=new Account(01234, 150, 1500);
		assertFalse(Bradesco.SufficientBalance(200));
	}
	@Test
	public void testNoLoan() {
		Account Bradesco=new Account(01234, 150, 1500);
		assertEquals(0,Bradesco.loan(2000));
	}
	@Test
	public void testLoan() {
		Account Bradesco=new Account(01234, 150, 1500);
		assertEquals(1150,Bradesco.loan(1000));
	}
}

