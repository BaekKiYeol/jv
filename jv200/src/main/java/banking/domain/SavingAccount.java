package banking.domain;

public class SavingAccount extends Account{
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;
	
	public SavingAccount(String accountNum, double balance) {
		this(accountNum, balance, DEFAULT_INTEREST_RATE);
	}
	
	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			 //잔고 부족 예외발생
			throw new InsufficientBalanceException("잔고 부족"+balance);
		}
		System.out.println("출금 전 금액 : " + balance + "원");
		balance -= amount;
		System.out.println("잔고에서 " + amount + "원을 출금하였습니다.");
		System.out.println("출금 후 금액 : " + balance + "원\n-------------------");
	}
	
//	이자율 생성 메소드
	public void setInteresRate(double interesRate) {
		this.interestRate = interesRate;
	}
}

