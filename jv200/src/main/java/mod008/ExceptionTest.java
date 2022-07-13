package mod008;

public class ExceptionTest {
	public static int PrimeNumber(int num) throws MyException, PrimeException {
		
		if(num <= 0) {
			System.out.println("입력한 숫자 : " + num);
			throw new MyException("입력 숫자 : " + num + "0 또는 입력할 수 없습니다.");
		}
		
		int count = 0;
		if(num == 1) {
			System.out.println(num + "은 소수입니다.");
		}else {
			for (int i = 2; i <= num; i++) {
		       for (int j = 2; j <= num; j++) {
		          if( i % j == 0) {
		             count++;
		          }
		       }
		       if(count > 1) {
		    	   count = 0;
		       }
		    }
		 if(count == 1) {
			 System.out.println(num + "은 소수입니다");
		 }else {
			 System.err.println("입력한 숫자:"+num);
			 LeastNumber l = new LeastNumber();
			 l.CommonMultiple(num);
			 throw new PrimeException();
		 	}
		}
		return num;
	}

	public static void main(String[] args) {
		try {
			PrimeNumber(6);
		} catch (MyException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage()); // 이 방법도 있지만 콘솔창에 오류가 안뜬다!
		} catch (PrimeException e) {
			e.printStackTrace();
		}
	}
}

