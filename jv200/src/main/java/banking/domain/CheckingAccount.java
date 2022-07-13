package banking.domain;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overdraftAccount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
	public void withdraw(double amount) { //마이너스 통장
		if(balance < amount) {
			//잔고 부족시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
			if(overdraftAmount + balance >= amount) {
				System.out.println("출금 전 금액 : " + balance +"원");
				balance = balance - amount;
				System.out.println("출금 후 금액 : " + balance + "원");
			}else {
				//한도 부족 예외 발생
				throw new InsufficientBalanceException("한도 부족");
			}
		}else {
			balance = balance-amount;
			System.out.println("잔액: " + balance);
		}
	}
	public void setOverdraftAmount(double setovdrdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}
}
