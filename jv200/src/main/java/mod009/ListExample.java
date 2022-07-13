package mod009;

import java.util.*;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");			//duplicate, is added
		list.add(new Integer(4));	//duplicate, is added
		System.out.println(list);
//		결과값 [one, second, 3rd, 4, 5.0, second, 4]
//		순서대로, 중복값 허용
	}
}
