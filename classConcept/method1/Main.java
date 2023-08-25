package method1;

import method2.Sub2;

public class Main {
	public static void main(String[] args) {
	
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		Sub sub = new Sub();
		Sub2 sub2 = new Sub2();
		method3.Sub2 sub3 = new method3.Sub2();
		/*
			ArrayList
			HashMap
			HashSet
			Random
			Scanner
			BigInteger
			String
			Integer
		 */
		
		// 한 개의 기능을 갖도록 구성
		list.add("데이터 입력");
		list.get(0);
		
		// 메서드에 입력하는 값은 0개 이상
		list.isEmpty();
		list.add(0, "데이터");
		int index = list.indexOf("데이터");
		
		// 메서드는 반환 데이터(Return Value)가 있을 수 있다.
		String data = "김 변 수";
		data.equals("이변수");
		data.split(" ");
		
		list.clear(); // 반환 데이터는 없는 것도 있다.
		
		sub.printMethod();
		sub.printMethod2("문자열");
		sub.printMethod2("");
		System.out.println("반환데이터 : " + sub.add(1, 2));
		int total = sub.add(3, 5);
		System.out.println("반환 데이터 : " + total);
	
		sub2.printMethod();
		int result = sub2.add(10, 20);
		System.out.println("10 + 20 = " + result);
		result = sub2.sub(10, 20);
		System.out.println("10 - 20 = " + result);
		
		
	}
}

















