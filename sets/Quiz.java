package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Quiz {

	public static void main(String[] args) {
		/*
		 * HashSet을 이용하여 로또 번호 6개 출력하기.(1-45)
		 */
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size() != 6)
			lotto.add(r.nextInt(45) + 1);
		
//		System.out.println(lotto);
		ArrayList<Integer> list = new ArrayList<>(lotto);
		list.sort(null); // 오름차순
		System.out.println(list);
	}

}
