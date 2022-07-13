package mod009;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");			//duplicate, not added
		set.add(new Integer(4));	//duplicate, not added
		System.out.println(set);
//		결과값 [5.0, 4, 3rd, one, second]
//		순서대로 안들어가고 중복값 허용 X
	}
}
