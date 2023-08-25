package maps;

import java.util.HashMap;

public class Exam1 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(0, "test");
		hm.put(1, "hello");
		
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
	}
}
