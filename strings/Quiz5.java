package strings;

public class Quiz5 {

	public static void main(String[] args) {
		/*
		 * String str = "김개똥 -2017년\n홍구리 -2015년\n선우선녀 -2018년";  
		 * 문자열 데이터를 아래와 같이 변경하여 출력 하시오.
		 */
		String str = "김개똥 -2017년\n홍구리 -2015년\n선우선녀 -2018년";  
		System.out.println("==== 변경 전  ====");
		System.out.println(str);
		
		str = str.replace("-", ": ");
		str = str.replaceAll("[0-9][0-9][0-9][0-9]", "2023");
		System.out.println("\n==== 변경 후  ====");
		System.out.println(str);
	}

}




