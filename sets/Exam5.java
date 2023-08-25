package sets;

import java.util.HashSet;

public class Exam5 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("1.대부");
		hs.add("2.반지의 제왕");
		hs.add("3.겨울왕국");
		hs.add("4.다크 나이트");
		hs.add("5.해리포터");
		hs.add("6.공공의 적");
		
		for(String data : hs) {
			System.out.println(data);
		}
		
		System.out.println();
		Iterator<String> it =  hs.iterator();
		while(it.hasNext()) {
			String data2 = it.next();
			System.out.println(data2);
		}
	}

}
