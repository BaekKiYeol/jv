package mod008;

public class MyException extends Exception {
	MyException(){
		//있어도 없어도 ㄱㅊ
	}
	
	MyException(String message) {
		super(message);
	}
	public String getMessage () {
		return "0과 음수는 입력할 수 없습니다.";
	}
}
