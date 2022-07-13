package mod009;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비"); //1:유비, key,value형태로 지정 가능
		map.put(2, "관우"); //자바 5.0부터 boxing, unboxing 자동으로 해준다(autoboxing)
		map.put(new Integer(3), "장비"); //자바 9부터 권고하는 형태
		
		System.out.println(map.get(2));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}
}
