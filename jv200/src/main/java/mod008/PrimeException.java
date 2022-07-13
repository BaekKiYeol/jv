package mod008;

public class PrimeException extends Exception{
	PrimeException(){
		
	}


	public String getMessage() {
		return ("소수가 아닙니다");
		
	}
}
