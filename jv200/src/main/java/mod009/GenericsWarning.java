package mod009;

import java.util.*;
public class GenericsWarning {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();  //generic code
		
		list.add(0, new String("String"));
		String str = ((String)list.get(0));
//		System.out.println(str);
		
		//for문으로
		for(String s:list) {
			System.out.println(s);
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			list.get(i);
//		}
//		위 방법은 예전방식.결과값은 동일
	}
}
