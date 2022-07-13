package banking.domain;

public class OverdraftException extends RuntimeException {
	private double overdraftAvail;
	
	public OverdraftException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		return "사용 가능한 대월액은 " + overdraftAvail + "원 입니다.";
	}
}
