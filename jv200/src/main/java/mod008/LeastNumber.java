package mod008;

public class LeastNumber {
	public int CommonMultiple(int num) {
		int tempNum = num;
		int quotient = 0;
		for(int i = 2; i < num; i++) {
			if(tempNum % i == 0) {
				quotient = i;
//				System.out.println(tempNumm+"을");
				tempNum = tempNum / quotient;
//				System.out.println(quotient+"로 나눔");
//				System.out.println("나머지값"+tempNum+"\n");
				i = 1;
				if(tempNum > 1) {
					System.out.print(quotient + "X");
				}
				if(tempNum == 1) {
					System.out.println(quotient + "="+num);
				}
			}
		}
		return num;
	}
}
