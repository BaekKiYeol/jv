package banking.domain;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		return "현재 잔고는 " + balance + "원 입니다.";
	}
}
