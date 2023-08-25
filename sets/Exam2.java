package sets;

import java.util.HashSet;

public class Exam2 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(123);
		hs.add(1.23);
		hs.add("순대");
		hs.add(1.23);

		System.out.println("HashSet : " + hs);


	}

}
