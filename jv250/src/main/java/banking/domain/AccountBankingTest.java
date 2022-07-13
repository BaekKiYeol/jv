package banking.domain;

public class AccountBankingTest {
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount(null, 0);
		savingAccount.deposite(5000);
		savingAccount.setInteresRate(10);
		savingAccount.withdraw(1000);
		
		CheckingAccount checkingAccount = new CheckingAccount(null, 0, 0);
		checkingAccount.deposite(1000);
		checkingAccount.setOverdraftAmount(2000);
		checkingAccount.withdraw(4000);
	
		
		
	}
}
