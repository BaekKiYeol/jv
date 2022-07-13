package banking.domain;

public class Account {
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	
	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	//Account 생성자 : 계좌번호와 초기 입금금액을 받는다.
	
	public void deposite(double amount) {
		System.out.println("입금 전 금액 : " + balance + "원");
		this.balance += amount;
		System.out.println("잔고에 " + amount + "원을 입금하였습니다.\n" + "입금 후 금액 : " + balance + "원\n-------------------"  );
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
}
